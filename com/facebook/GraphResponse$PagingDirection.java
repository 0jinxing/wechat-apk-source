package com.facebook;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum GraphResponse$PagingDirection
{
  static
  {
    AppMethodBeat.i(71761);
    NEXT = new PagingDirection("NEXT", 0);
    PREVIOUS = new PagingDirection("PREVIOUS", 1);
    $VALUES = new PagingDirection[] { NEXT, PREVIOUS };
    AppMethodBeat.o(71761);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.GraphResponse.PagingDirection
 * JD-Core Version:    0.6.2
 */