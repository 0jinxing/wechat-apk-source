package com.google.android.exoplayer2.f.g;

import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e$a
{
  Layout.Alignment bkV;
  float bkW;
  int bkX;
  float bkY;
  int bkZ;
  SpannableStringBuilder boD;
  long endTime;
  int lineType;
  long startTime;
  float width;

  public e$a()
  {
    AppMethodBeat.i(95726);
    reset();
    AppMethodBeat.o(95726);
  }

  private a td()
  {
    AppMethodBeat.i(95728);
    if (this.bkV == null)
      this.bkZ = -2147483648;
    while (true)
    {
      AppMethodBeat.o(95728);
      return this;
      switch (e.1.boC[this.bkV.ordinal()])
      {
      default:
        new StringBuilder("Unrecognized alignment: ").append(this.bkV);
        this.bkZ = 0;
        break;
      case 1:
        this.bkZ = 0;
        break;
      case 2:
        this.bkZ = 1;
        break;
      case 3:
        this.bkZ = 2;
      }
    }
  }

  public final void reset()
  {
    this.startTime = 0L;
    this.endTime = 0L;
    this.boD = null;
    this.bkV = null;
    this.bkW = 1.4E-45F;
    this.lineType = -2147483648;
    this.bkX = -2147483648;
    this.bkY = 1.4E-45F;
    this.bkZ = -2147483648;
    this.width = 1.4E-45F;
  }

  public final e tc()
  {
    AppMethodBeat.i(95727);
    if ((this.bkY != 1.4E-45F) && (this.bkZ == -2147483648))
      td();
    e locale = new e(this.startTime, this.endTime, this.boD, this.bkV, this.bkW, this.lineType, this.bkX, this.bkY, this.bkZ, this.width);
    AppMethodBeat.o(95727);
    return locale;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.g.e.a
 * JD-Core Version:    0.6.2
 */