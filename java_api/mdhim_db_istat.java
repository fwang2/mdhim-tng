package mdhim;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * Used for transmitting integer stats to all nodes<br>
 * <i>native declaration : mdhim-tng-ycsb/src/data_store.h:1016</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("mdhim") 
public class mdhim_db_istat extends StructObject {
	static {
		BridJ.register();
	}
	@Field(0) 
	public int slice() {
		return this.io.getIntField(this, 0);
	}
	@Field(0) 
	public mdhim_db_istat slice(int slice) {
		this.io.setIntField(this, 0, slice);
		return this;
	}
	@Field(1) 
	public long num() {
		return this.io.getLongField(this, 1);
	}
	@Field(1) 
	public mdhim_db_istat num(long num) {
		this.io.setLongField(this, 1, num);
		return this;
	}
	@Field(2) 
	public long imax() {
		return this.io.getLongField(this, 2);
	}
	@Field(2) 
	public mdhim_db_istat imax(long imax) {
		this.io.setLongField(this, 2, imax);
		return this;
	}
	@Field(3) 
	public long imin() {
		return this.io.getLongField(this, 3);
	}
	@Field(3) 
	public mdhim_db_istat imin(long imin) {
		this.io.setLongField(this, 3, imin);
		return this;
	}
	public mdhim_db_istat() {
		super();
	}
	public mdhim_db_istat(Pointer pointer) {
		super(pointer);
	}
}
