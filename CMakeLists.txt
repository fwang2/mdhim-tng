# Build for mdhim library
#
# fwang2@ornl.gov

cmake_minimum_required(VERSION 2.8)
project(mdhim)

set(CMAKE_MODULE_PATH ${PROJECT_SOURCE_DIR}/cmk)

if ( ${CMAKE_SOURCE_DIR} STREQUAL ${CMAKE_BINARY_DIR}  )
        file(REMOVE test.txt)
        message( FATAL_ERROR "In-source builds not allowed. Please make a new
        directory (called a build directory) and run CMake from there. You may
        need to remove CMakeCache.txt."  )
endif()


# remove -std=c99, not compatible
set(CMAKE_C_FLAGS  "${CMAKE_C_FLAGS} -Wall -std=gnu99")
set(CMAKE_C_FLAGS_DEBUG  "${CMAKE_C_FLAGS_DEBUG} -Wall -std=c99")

# set c++11 support
set(CMAKE_CXX_FLAGS  "${CMAKE_CXX_CFLAGS} -Wall -std=c++11")
set(CMAKE_CXX_FLAGS_DEBUG   "${CMAKE_CXX_FLAGS_DEBUG} -Wall")
set(CMAKE_CXX_FLAGS_RELEASE "${CMAKE_CXX_FLAGS_RELEASE} -Wall")

# MPI
find_package(MPI REQUIRED)
include_directories(SYSTEM ${MPI_INCLUDE_PATH})

# LevelDB
find_package(LevelDB REQUIRED)
include_directories(SYSTEM ${LevelDB_INCLUDE_PATH})
add_definitions(-DLEVELDB_SUPPORT)

# Threads
find_package( Threads REQUIRED)

add_subdirectory(src)

