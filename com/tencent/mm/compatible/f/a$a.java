package com.tencent.mm.compatible.f;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Locale;

public final class a$a
{
  public String ceO;
  public int euw;
  public int eux;
  public int euy;
  SparseArray<String> euz;

  public final String toString()
  {
    AppMethodBeat.i(93039);
    String str = String.format(Locale.US, "pkgname: %s, minCode:%d, maxCode: %d, value: %s, chkExp: %d", new Object[] { this.ceO, Integer.valueOf(this.euw), Integer.valueOf(this.eux), this.euz, Integer.valueOf(this.euy) });
    AppMethodBeat.o(93039);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.f.a.a
 * JD-Core Version:    0.6.2
 */