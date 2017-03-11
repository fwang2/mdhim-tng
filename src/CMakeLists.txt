include_directories(SYSTEM uthash)
set(MDHIM_SRC 
    mdhim.c 
    Mlog2/mlog2.c 
    mdhim_private.c 
    client.c 
    local_client.c 
    messages.c 
    partitioner.c 
    indexes.c 
    data_store.c 
    ds_leveldb.c 
    range_server.c 
    mdhim_options.c 
)

add_library(mdhim ${MDHIM_SRC})

install(TARGETS mdhim 
        LIBRARY DESTINATION lib
        ARCHIVE DESTINATION lib)

install(FILES mdhim.h 
    DESTINATION include)
