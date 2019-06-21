package com.tencent.mm.plugin.fts.a.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.l;
import java.util.List;

public final class e$a
{
  public int businessType = 0;
  public g mDz = null;
  public int mFb = 2147483647;
  public boolean mFc = true;
  public int mFd = 2147483647;
  public boolean mFe = false;
  public List<l> mFf = null;
  public boolean mFg = true;
  public l mFh;
  public int mFi = 0;

  public final String toString()
  {
    int i = 0;
    AppMethodBeat.i(114298);
    int j = this.mFb;
    boolean bool1 = this.mFc;
    int k = this.mFd;
    boolean bool2 = this.mFe;
    int m = this.businessType;
    if (this.mFf == null);
    while (true)
    {
      String str = String.format("{%d, %b, %d, %b, %d, %d, %d}", new Object[] { Integer.valueOf(j), Boolean.valueOf(bool1), Integer.valueOf(k), Boolean.valueOf(bool2), Integer.valueOf(m), Integer.valueOf(i), Integer.valueOf(this.mFi) });
      AppMethodBeat.o(114298);
      return str;
      i = this.mFf.size();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.d.e.a
 * JD-Core Version:    0.6.2
 */