package com.bumptech.glide.c.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$e
{
  private boolean aAP;
  private boolean aAQ;
  private boolean aAR;

  private boolean mD()
  {
    if (((this.aAR) || (this.aAQ)) && (this.aAP));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final boolean mA()
  {
    try
    {
      AppMethodBeat.i(91775);
      this.aAP = true;
      boolean bool = mD();
      AppMethodBeat.o(91775);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  final boolean mB()
  {
    try
    {
      AppMethodBeat.i(91776);
      this.aAQ = true;
      boolean bool = mD();
      AppMethodBeat.o(91776);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  final boolean mC()
  {
    try
    {
      AppMethodBeat.i(91777);
      this.aAR = true;
      boolean bool = mD();
      AppMethodBeat.o(91777);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  final void reset()
  {
    try
    {
      this.aAQ = false;
      this.aAP = false;
      this.aAR = false;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.g.e
 * JD-Core Version:    0.6.2
 */