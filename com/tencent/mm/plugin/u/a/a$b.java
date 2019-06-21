package com.tencent.mm.plugin.u.a;

import android.os.AsyncTask;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.sdk.platformtools.ab;

final class a$b extends AsyncTask<String, Integer, d>
{
  a$b(a parama)
  {
  }

  private d E(String[] paramArrayOfString)
  {
    StringBuilder localStringBuilder = null;
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(80739);
    ab.d("dktest", "doInBackground :".concat(String.valueOf(paramArrayOfString)));
    if ((paramArrayOfString == null) || (paramArrayOfString.length != 1))
    {
      AppMethodBeat.o(80739);
      paramArrayOfString = (String[])localObject2;
    }
    while (true)
    {
      return paramArrayOfString;
      Object localObject3 = localStringBuilder;
      localObject2 = localObject1;
      try
      {
        this.pAn.pAm = System.currentTimeMillis();
        localObject3 = localStringBuilder;
        localObject2 = localObject1;
        g.a locala = new com/tencent/mm/compatible/util/g$a;
        localObject3 = localStringBuilder;
        localObject2 = localObject1;
        locala.<init>();
        localObject3 = localStringBuilder;
        localObject2 = localObject1;
        paramArrayOfString = this.pAn.Vu(paramArrayOfString[0]);
        localObject3 = paramArrayOfString;
        localObject2 = paramArrayOfString;
        localStringBuilder = new java/lang/StringBuilder;
        localObject3 = paramArrayOfString;
        localObject2 = paramArrayOfString;
        localStringBuilder.<init>("time: ");
        localObject3 = paramArrayOfString;
        localObject2 = paramArrayOfString;
        ab.d("MicroMsg.scanner.DecodeFile", locala.Mr());
        AppMethodBeat.o(80739);
      }
      catch (OutOfMemoryError paramArrayOfString)
      {
        while (true)
        {
          ab.e("MicroMsg.scanner.DecodeFile", "decode failed, OutOfMemoryError");
          paramArrayOfString = (String[])localObject3;
        }
      }
      catch (Exception paramArrayOfString)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.scanner.DecodeFile", paramArrayOfString, "decode failed due to Exception", new Object[] { "" });
          paramArrayOfString = (String[])localObject2;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.u.a.a.b
 * JD-Core Version:    0.6.2
 */