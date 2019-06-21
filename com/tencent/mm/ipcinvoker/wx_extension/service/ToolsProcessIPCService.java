package com.tencent.mm.ipcinvoker.wx_extension.service;

import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.BaseIPCService;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.ipcinvoker.wx_extension.a.a.b;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.Map;

public class ToolsProcessIPCService extends BaseIPCService
{
  static int eGQ = 0;

  public static boolean Qb()
  {
    boolean bool = true;
    AppMethodBeat.i(126226);
    Object localObject;
    int i;
    if (eGQ == 0)
    {
      localObject = a.b.eGM;
      localObject = com.tencent.mm.ipcinvoker.wx_extension.a.a.ll("100488");
      if (localObject == null)
      {
        i = 0;
        if (i == 0)
          break label123;
        eGQ = 1;
      }
    }
    else
    {
      label37: if (eGQ <= 0)
        break label130;
      AppMethodBeat.o(126226);
    }
    while (true)
    {
      return bool;
      if ((((com.tencent.mm.storage.c)localObject).isValid()) && ("1".equals(((com.tencent.mm.storage.c)localObject).dru().get("SAFEFLAG"))))
      {
        i = 1;
        label78: if ((!((com.tencent.mm.storage.c)localObject).isValid()) || (!"1".equals(((com.tencent.mm.storage.c)localObject).dru().get("TURNOFFTOOLMP"))))
          break label118;
      }
      label118: for (int j = 1; ; j = 0)
      {
        i &= j;
        break;
        i = 0;
        break label78;
      }
      label123: eGQ = -1;
      break label37;
      label130: AppMethodBeat.o(126226);
      bool = false;
    }
  }

  public static <T extends com.tencent.mm.ipcinvoker.a<InputType, ResultType>, InputType extends Parcelable, ResultType extends Parcelable> boolean a(InputType paramInputType, Class<T> paramClass)
  {
    AppMethodBeat.i(126227);
    boolean bool;
    if (!ah.amz(ah.getPackageName() + ":tools"))
    {
      bool = false;
      AppMethodBeat.o(126227);
    }
    while (true)
    {
      return bool;
      bool = f.a("com.tencent.mm:tools", paramInputType, paramClass, null);
      AppMethodBeat.o(126227);
    }
  }

  public static <T extends com.tencent.mm.ipcinvoker.a<InputType, ResultType>, InputType extends Parcelable, ResultType extends Parcelable> boolean a(InputType paramInputType, Class<T> paramClass, com.tencent.mm.ipcinvoker.c<ResultType> paramc)
  {
    AppMethodBeat.i(126229);
    boolean bool = f.a("com.tencent.mm:tools", paramInputType, paramClass, paramc);
    AppMethodBeat.o(126229);
    return bool;
  }

  public static <T extends com.tencent.mm.ipcinvoker.a<InputType, ResultType>, InputType extends Parcelable, ResultType extends Parcelable> boolean b(InputType paramInputType, Class<T> paramClass)
  {
    AppMethodBeat.i(126228);
    boolean bool1 = f.a("com.tencent.mm:tools", paramInputType, paramClass, null);
    boolean bool2 = bool1;
    if (!Qb())
      if ((!f.a("com.tencent.mm:toolsmp", paramInputType, paramClass, null)) || (!bool1))
        break label46;
    label46: for (bool2 = true; ; bool2 = false)
    {
      AppMethodBeat.o(126228);
      return bool2;
    }
  }

  public final String getProcessName()
  {
    return "com.tencent.mm:tools";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService
 * JD-Core Version:    0.6.2
 */