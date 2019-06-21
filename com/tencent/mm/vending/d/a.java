package com.tencent.mm.vending.d;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  Bundle zXI;

  public a(Intent paramIntent)
  {
    AppMethodBeat.i(126078);
    this.zXI = null;
    this.zXI = paramIntent.getExtras();
    AppMethodBeat.o(126078);
  }

  public final int getIntExtra(String paramString, int paramInt)
  {
    AppMethodBeat.i(126079);
    if (this.zXI == null)
      AppMethodBeat.o(126079);
    while (true)
    {
      return paramInt;
      paramInt = this.zXI.getInt(paramString, paramInt);
      AppMethodBeat.o(126079);
    }
  }

  public final String getStringExtra(String paramString)
  {
    AppMethodBeat.i(126080);
    if (this.zXI == null)
    {
      paramString = null;
      AppMethodBeat.o(126080);
    }
    while (true)
    {
      return paramString;
      paramString = this.zXI.getString(paramString);
      AppMethodBeat.o(126080);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.d.a
 * JD-Core Version:    0.6.2
 */