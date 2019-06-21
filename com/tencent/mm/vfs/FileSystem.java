package com.tencent.mm.vfs;

import android.os.CancellationSignal;
import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

public abstract interface FileSystem extends Parcelable
{
  public abstract OutputStream L(String paramString, boolean paramBoolean);

  public abstract List<a> M(String paramString, boolean paramBoolean);

  public abstract boolean N(String paramString, boolean paramBoolean);

  public abstract String O(String paramString, boolean paramBoolean);

  public abstract void a(CancellationSignal paramCancellationSignal);

  public abstract boolean aS(String paramString1, String paramString2);

  public abstract int aiR();

  public abstract boolean exists(String paramString);

  public abstract InputStream openRead(String paramString);

  public abstract void p(Map<String, String> paramMap);

  public abstract boolean pI(String paramString);

  public abstract boolean t(String paramString, long paramLong);

  public abstract boolean tf(String paramString);

  public abstract b tn(String paramString);

  public abstract a to(String paramString);

  public static final class a
  {
    public final String name;
    public final long size;
    public final String zYK;
    public final long zYL;
    public final long zYM;
    public final boolean zYN;
    private final FileSystem zYO;

    public a(FileSystem paramFileSystem, String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean)
    {
      this.zYO = paramFileSystem;
      this.zYK = paramString1;
      this.name = paramString2;
      this.size = paramLong1;
      this.zYL = paramLong2;
      this.zYM = paramLong3;
      this.zYN = paramBoolean;
    }

    public final InputStream dMu()
    {
      AppMethodBeat.i(54504);
      InputStream localInputStream = this.zYO.openRead(this.zYK);
      AppMethodBeat.o(54504);
      return localInputStream;
    }

    public final boolean delete()
    {
      AppMethodBeat.i(54505);
      boolean bool;
      if (this.zYN)
      {
        bool = this.zYO.N(this.zYK, false);
        AppMethodBeat.o(54505);
      }
      while (true)
      {
        return bool;
        bool = this.zYO.pI(this.zYK);
        AppMethodBeat.o(54505);
      }
    }

    public final String toString()
    {
      AppMethodBeat.i(54506);
      String str = this.zYK + " -> " + this.zYO.toString();
      if (this.zYN)
      {
        str = "[DIR] ".concat(String.valueOf(str));
        AppMethodBeat.o(54506);
      }
      while (true)
      {
        return str;
        AppMethodBeat.o(54506);
      }
    }
  }

  public static final class b
  {
    public long xBv;
    public long xBx;
    public long xBy;
    public long zYP;
    public long zYQ;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vfs.FileSystem
 * JD-Core Version:    0.6.2
 */