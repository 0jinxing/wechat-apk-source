package com.tencent.mm.plugin.wallet;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
{
  public int index;
  public String teR;
  public StringBuffer teS;

  public a()
  {
    AppMethodBeat.i(135764);
    this.teR = "";
    this.index = 0;
    this.teS = new StringBuffer();
    AppMethodBeat.o(135764);
  }

  public static boolean a(a parama, Intent paramIntent)
  {
    AppMethodBeat.i(135769);
    boolean bool;
    if (parama == null)
    {
      bool = false;
      AppMethodBeat.o(135769);
    }
    while (true)
    {
      return bool;
      paramIntent.putExtra("WECHAT_PAY_LOG_REPORT_INDEX", parama.index);
      paramIntent.putExtra("WECHAT_PAY_LOG_REPORT_DATA", parama.teS.toString());
      paramIntent.putExtra("WECHAT_PAY_LOG_REPORT_BASEIFO", parama.teR);
      bool = true;
      AppMethodBeat.o(135769);
    }
  }

  public static a at(Intent paramIntent)
  {
    AppMethodBeat.i(135770);
    int i = paramIntent.getIntExtra("WECHAT_PAY_LOG_REPORT_INDEX", -1);
    if (i == -1)
    {
      paramIntent = null;
      AppMethodBeat.o(135770);
    }
    while (true)
    {
      return paramIntent;
      a locala = new a();
      locala.index = i;
      locala.teS = new StringBuffer(bo.bc(paramIntent.getStringExtra("WECHAT_PAY_LOG_REPORT_DATA"), ""));
      locala.teR = bo.bc(paramIntent.getStringExtra("WECHAT_PAY_LOG_REPORT_BASEIFO"), "");
      AppMethodBeat.o(135770);
      paramIntent = locala;
    }
  }

  public static a dq(String paramString, int paramInt)
  {
    AppMethodBeat.i(135765);
    a locala = new a();
    locala.teR = (paramString + "," + paramInt);
    AppMethodBeat.o(135765);
    return locala;
  }

  private static String s(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(135767);
    if ((paramArrayOfObject == null) || (paramArrayOfObject.length <= 0))
      ab.w("MicroMsg.PayLogReport", "vals is null, use '' as value");
    StringBuilder localStringBuilder;
    for (paramArrayOfObject = ""; ; paramArrayOfObject = localStringBuilder.toString())
    {
      AppMethodBeat.o(135767);
      return paramArrayOfObject;
      localStringBuilder = new StringBuilder();
      int i = paramArrayOfObject.length - 1;
      for (int j = 0; j < i; j++)
        localStringBuilder.append(String.valueOf(paramArrayOfObject[j])).append(',');
      localStringBuilder.append(String.valueOf(paramArrayOfObject[i]));
    }
  }

  public final void bs(int paramInt, String paramString)
  {
    AppMethodBeat.i(135768);
    paramString = String.format("{%d, %s, %d, %s},", new Object[] { Integer.valueOf(this.index), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramInt), paramString });
    this.index += 1;
    ab.i("MicroMsg.PayLogReport", "test for log ".concat(String.valueOf(paramString)));
    this.teS.append(paramString);
    AppMethodBeat.o(135768);
  }

  public final void i(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(135766);
    bs(paramInt, s(paramArrayOfObject));
    AppMethodBeat.o(135766);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.a
 * JD-Core Version:    0.6.2
 */