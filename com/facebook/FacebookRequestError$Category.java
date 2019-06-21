package com.facebook;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum FacebookRequestError$Category
{
  static
  {
    AppMethodBeat.i(71587);
    LOGIN_RECOVERABLE = new Category("LOGIN_RECOVERABLE", 0);
    OTHER = new Category("OTHER", 1);
    TRANSIENT = new Category("TRANSIENT", 2);
    $VALUES = new Category[] { LOGIN_RECOVERABLE, OTHER, TRANSIENT };
    AppMethodBeat.o(71587);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.FacebookRequestError.Category
 * JD-Core Version:    0.6.2
 */