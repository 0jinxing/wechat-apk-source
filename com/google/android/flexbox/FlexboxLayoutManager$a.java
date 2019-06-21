package com.google.android.flexbox;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class FlexboxLayoutManager$a
{
  private int alN;
  private boolean alO;
  private boolean alP;
  private int bui;
  private int buj;
  private boolean buk;
  private int mPosition;

  static
  {
    AppMethodBeat.i(54782);
    if (!FlexboxLayoutManager.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(54782);
      return;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(54778);
    String str = "AnchorInfo{mPosition=" + this.mPosition + ", mFlexLinePosition=" + this.bui + ", mCoordinate=" + this.alN + ", mPerpendicularCoordinate=" + this.buj + ", mLayoutFromEnd=" + this.alO + ", mValid=" + this.alP + ", mAssignedFromSavedState=" + this.buk + '}';
    AppMethodBeat.o(54778);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.flexbox.FlexboxLayoutManager.a
 * JD-Core Version:    0.6.2
 */