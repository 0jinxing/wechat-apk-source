package com.tencent.mm.plugin.radar.ui;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.boy;
import com.tencent.mm.protocal.protobuf.bpb;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/ui/RadarUtils;", "", "()V", "getEncodeUsername", "", "member", "Lcom/tencent/mm/protocal/protobuf/RadarChatRoomMember;", "Lcom/tencent/mm/protocal/protobuf/RadarSearchMember;", "getUsername", "lowerThanXHDPI", "", "context", "Landroid/content/Context;", "plugin-radar_release"})
public final class g
{
  public static final g pDK;

  static
  {
    AppMethodBeat.i(103079);
    pDK = new g();
    AppMethodBeat.o(103079);
  }

  public static String a(boy paramboy)
  {
    if (paramboy != null)
    {
      String str = paramboy.wfK;
      Object localObject = str;
      if (str == null)
      {
        paramboy = paramboy.jBB;
        localObject = paramboy;
        if (paramboy == null)
          localObject = "";
      }
      paramboy = (boy)localObject;
      if (localObject != null);
    }
    else
    {
      paramboy = "";
    }
    return paramboy;
  }

  public static String b(bpb parambpb)
  {
    AppMethodBeat.i(103077);
    j.p(parambpb, "member");
    String str = parambpb.jBB;
    Object localObject = str;
    if (str == null)
    {
      parambpb = parambpb.wfK;
      localObject = parambpb;
      if (parambpb == null)
        localObject = "";
    }
    AppMethodBeat.o(103077);
    return localObject;
  }

  public static String c(bpb parambpb)
  {
    if (parambpb != null)
    {
      String str = parambpb.wfK;
      Object localObject = str;
      if (str == null)
      {
        parambpb = parambpb.jBB;
        localObject = parambpb;
        if (parambpb == null)
          localObject = "";
      }
      parambpb = (bpb)localObject;
      if (localObject != null);
    }
    else
    {
      parambpb = "";
    }
    return parambpb;
  }

  public static boolean eJ(Context paramContext)
  {
    AppMethodBeat.i(103078);
    j.p(paramContext, "context");
    paramContext = paramContext.getResources();
    j.o(paramContext, "context.resources");
    boolean bool;
    if (paramContext.getDisplayMetrics().densityDpi <= 240)
    {
      bool = true;
      AppMethodBeat.o(103078);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(103078);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.g
 * JD-Core Version:    0.6.2
 */