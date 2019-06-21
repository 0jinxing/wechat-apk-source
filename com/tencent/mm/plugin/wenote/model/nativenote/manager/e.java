package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;

public class e
  implements Serializable
{
  public int Ls;
  public int aqm;

  public e(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(26766);
    this.aqm = paramInt1;
    this.Ls = paramInt2;
    if (this.aqm > this.Ls)
    {
      paramInt1 = this.Ls;
      this.Ls = this.aqm;
      this.aqm = paramInt1;
    }
    AppMethodBeat.o(26766);
  }

  public e(EditText paramEditText)
  {
    this(paramEditText.getSelectionStart(), paramEditText.getSelectionEnd());
    AppMethodBeat.i(26767);
    AppMethodBeat.o(26767);
  }

  public final e gH(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(26768);
    this.aqm = Math.max(0, this.aqm - paramInt1);
    this.Ls += paramInt2;
    AppMethodBeat.o(26768);
    return this;
  }

  public final boolean isEmpty()
  {
    if (this.aqm == this.Ls);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public String toString()
  {
    AppMethodBeat.i(26769);
    String str = "[" + this.aqm + ", " + this.Ls + "]";
    AppMethodBeat.o(26769);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.manager.e
 * JD-Core Version:    0.6.2
 */