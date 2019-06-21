package com.tencent.mm.booter;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Looper;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.y;

public final class n
{
  static long ecE = 0L;

  public static void BY()
  {
    AppMethodBeat.i(15868);
    jI("mm_proc_startup");
    jI("push_proc_startup");
    AppMethodBeat.o(15868);
  }

  public static void IE()
  {
    AppMethodBeat.i(15867);
    SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences("mm_proc_startup", 0);
    Object localObject1 = localSharedPreferences.getString("startup_info", "").split("=");
    if ((localObject1 != null) && (localObject1.length > 0))
    {
      localObject2 = new a();
      if (((a)localObject2).jK(localObject1[(localObject1.length - 1)]))
      {
        ((a)localObject2).ecK = Process.myPid();
        localObject1[(localObject1.length - 1)] = ((a)localObject2).toString();
      }
    }
    Object localObject2 = new a();
    ((a)localObject2).ecG = 2;
    ((a)localObject2).ecI = Process.myPid();
    ((a)localObject2).ecJ = ((int)bo.anT());
    String str = g((String[])localObject1);
    localObject2 = ((a)localObject2).toString();
    localObject1 = localObject2;
    if (str.length() > 0)
      localObject1 = str + "=" + (String)localObject2;
    ab.d("MicroMsg.ProcessReport", "startProc new info %s", new Object[] { localObject1 });
    localSharedPreferences.edit().putString("startup_info", (String)localObject1).commit();
    AppMethodBeat.o(15867);
  }

  public static void IF()
  {
    AppMethodBeat.i(15870);
    if ((ecE != 0L) && (bo.az(ecE) < 3600000L))
      AppMethodBeat.o(15870);
    while (true)
    {
      return;
      int i = ((Integer)aw.ZI().get(37, Integer.valueOf(0))).intValue();
      if (d.vxo != i)
      {
        aw.ZI().set(37, Integer.valueOf(d.vxo));
        new ak(Looper.getMainLooper()).post(new n.1(i));
      }
      ecE = bo.yz();
      new ak(Looper.getMainLooper()).post(new n.2());
      AppMethodBeat.o(15870);
    }
  }

  private static String g(String[] paramArrayOfString)
  {
    AppMethodBeat.i(15871);
    String str1 = "";
    int i = 1;
    int j = paramArrayOfString.length;
    int k = 0;
    if (k < j)
    {
      String str2 = paramArrayOfString[k];
      if (i != 0)
        i = 0;
      while (true)
      {
        str1 = str1 + str2;
        k++;
        break;
        str1 = str1 + "=";
      }
    }
    AppMethodBeat.o(15871);
    return str1;
  }

  private static void jI(String paramString)
  {
    AppMethodBeat.i(15869);
    paramString = ah.getContext().getSharedPreferences(paramString, 0);
    Object localObject = paramString.getString("startup_info", "").split("=");
    if ((localObject == null) || (localObject.length == 0))
      AppMethodBeat.o(15869);
    while (true)
    {
      return;
      a locala = new a();
      if (locala.jK(localObject[(localObject.length - 1)]))
      {
        locala.ecH = 2;
        localObject[(localObject.length - 1)] = locala.toString();
      }
      localObject = g((String[])localObject);
      ab.d("MicroMsg.ProcessReport", "uerExit new info %s", new Object[] { localObject });
      paramString.edit().putString("startup_info", (String)localObject).commit();
      AppMethodBeat.o(15869);
    }
  }

  static final class a
  {
    int ecG;
    int ecH = 1;
    int ecI;
    int ecJ;
    int ecK;

    public final boolean jK(String paramString)
    {
      boolean bool = true;
      AppMethodBeat.i(15865);
      paramString = paramString.split(",");
      if ((paramString == null) || (paramString.length != 5))
      {
        ab.e("MicroMsg.ProcessReport", "error format");
        AppMethodBeat.o(15865);
        bool = false;
      }
      while (true)
      {
        return bool;
        try
        {
          this.ecG = bo.getInt(paramString[0], 0);
          this.ecH = bo.getInt(paramString[1], 0);
          this.ecI = bo.getInt(paramString[2], 0);
          this.ecJ = bo.getInt(paramString[3], 0);
          this.ecK = bo.getInt(paramString[4], 0);
          AppMethodBeat.o(15865);
        }
        catch (Exception paramString)
        {
          ab.e("MicroMsg.ProcessReport", "ParseFrom parse failed");
          ab.printErrStackTrace("MicroMsg.ProcessReport", paramString, "", new Object[0]);
          AppMethodBeat.o(15865);
          bool = false;
        }
      }
    }

    public final String toString()
    {
      AppMethodBeat.i(15866);
      String str = String.format("%d,%d,%d,%d,%d", new Object[] { Integer.valueOf(this.ecG), Integer.valueOf(this.ecH), Integer.valueOf(this.ecI), Integer.valueOf(this.ecJ), Integer.valueOf(this.ecK) });
      AppMethodBeat.o(15866);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.n
 * JD-Core Version:    0.6.2
 */