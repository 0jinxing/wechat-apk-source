package com.tencent.mm.vfs;

import android.os.CancellationSignal;
import android.os.Parcel;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

public abstract class FileSystemWrapper extends AbstractFileSystem
{
  protected final FileSystem zYO;

  protected FileSystemWrapper(FileSystem paramFileSystem)
  {
    this.zYO = paramFileSystem;
  }

  public OutputStream L(String paramString, boolean paramBoolean)
  {
    return this.zYO.L(paramString, paramBoolean);
  }

  public final List<FileSystem.a> M(String paramString, boolean paramBoolean)
  {
    return this.zYO.M(paramString, paramBoolean);
  }

  public final boolean N(String paramString, boolean paramBoolean)
  {
    return this.zYO.N(paramString, paramBoolean);
  }

  public final String O(String paramString, boolean paramBoolean)
  {
    return this.zYO.O(paramString, paramBoolean);
  }

  public void a(CancellationSignal paramCancellationSignal)
  {
    this.zYO.a(paramCancellationSignal);
  }

  public final boolean aS(String paramString1, String paramString2)
  {
    return this.zYO.aS(paramString1, paramString2);
  }

  public final int aiR()
  {
    return this.zYO.aiR();
  }

  public int describeContents()
  {
    return 0;
  }

  public final boolean exists(String paramString)
  {
    return this.zYO.exists(paramString);
  }

  public InputStream openRead(String paramString)
  {
    return this.zYO.openRead(paramString);
  }

  public final void p(Map<String, String> paramMap)
  {
    this.zYO.p(paramMap);
  }

  public final boolean pI(String paramString)
  {
    return this.zYO.pI(paramString);
  }

  public final boolean t(String paramString, long paramLong)
  {
    return this.zYO.t(paramString, paramLong);
  }

  public final boolean tf(String paramString)
  {
    return this.zYO.tf(paramString);
  }

  public final FileSystem.b tn(String paramString)
  {
    return this.zYO.tn(paramString);
  }

  public final FileSystem.a to(String paramString)
  {
    return this.zYO.to(paramString);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.zYO, paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vfs.FileSystemWrapper
 * JD-Core Version:    0.6.2
 */