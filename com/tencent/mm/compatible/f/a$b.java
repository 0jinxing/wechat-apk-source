package com.tencent.mm.compatible.f;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Locale;

public final class a$b
{
  public String euA;
  public int euy;
  SparseArray<String> euz;
  public String model;
  public String version;

  public final String toString()
  {
    AppMethodBeat.i(93040);
    String str = String.format(Locale.US, "manufacture: %s, model: %s, version: %s, value: %s, chkExp: %d", new Object[] { this.euA, this.model, this.version, this.euz, Integer.valueOf(this.euy) });
    AppMethodBeat.o(93040);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.f.a.b
 * JD-Core Version:    0.6.2
 */