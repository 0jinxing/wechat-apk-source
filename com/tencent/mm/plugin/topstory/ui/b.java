package com.tencent.mm.plugin.topstory.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Process;
import android.text.method.ScrollingMovementMethod;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.te;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.topstory.PluginTopStory;
import com.tencent.mm.plugin.topstory.ui.debug.TopStoryDebugUI;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.plugin.websearch.api.ao;
import com.tencent.mm.protocal.protobuf.cht;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.t;

public final class b
  implements com.tencent.mm.pluginsdk.cmd.a
{
  public boolean sBj;
  public boolean sBk;
  public boolean sBl;

  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    AppMethodBeat.i(1528);
    if (ab.getLogLevel() > 1)
      AppMethodBeat.o(1528);
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      if (paramArrayOfString.length >= 2)
        break;
      AppMethodBeat.o(1528);
    }
    paramString = paramArrayOfString[1];
    int i = -1;
    switch (paramString.hashCode())
    {
    default:
      label184: switch (i)
      {
      default:
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      }
      break;
    case 3173:
    case 3186:
    case 3681:
    case 3489:
    case 3183:
    case 3634:
    case 3495451:
    case 3056749:
    case 94790908:
    case 94820699:
    case 3237038:
    case 3185:
    case 3212:
    case 98820:
    case 94746285:
    }
    while (true)
    {
      AppMethodBeat.o(1528);
      bool = true;
      break;
      if (!paramString.equals("ch"))
        break label184;
      i = 0;
      break label184;
      if (!paramString.equals("cu"))
        break label184;
      i = 1;
      break label184;
      if (!paramString.equals("st"))
        break label184;
      i = 2;
      break label184;
      if (!paramString.equals("mn"))
        break label184;
      i = 3;
      break label184;
      if (!paramString.equals("cr"))
        break label184;
      i = 4;
      break label184;
      if (!paramString.equals("rd"))
        break label184;
      i = 5;
      break label184;
      if (!paramString.equals("rdcl"))
        break label184;
      i = 6;
      break label184;
      if (!paramString.equals("clrv"))
        break label184;
      i = 7;
      break label184;
      if (!paramString.equals("cmtrd"))
        break label184;
      i = 8;
      break label184;
      if (!paramString.equals("cntrd"))
        break label184;
      i = 9;
      break label184;
      if (!paramString.equals("info"))
        break label184;
      i = 10;
      break label184;
      if (!paramString.equals("ct"))
        break label184;
      i = 11;
      break label184;
      if (!paramString.equals("dp"))
        break label184;
      i = 12;
      break label184;
      if (!paramString.equals("cst"))
        break label184;
      i = 13;
      break label184;
      if (!paramString.equals("cledu"))
        break label184;
      i = 14;
      break label184;
      g.RP().Ry().set(ac.a.xVr, "");
      continue;
      paramContext = new te();
      paramContext.cPr.actionType = 2;
      com.tencent.mm.sdk.b.a.xxA.m(paramContext);
      continue;
      this.sBj = true;
      continue;
      this.sBk = true;
      continue;
      this.sBl = true;
      continue;
      paramContext = new cht();
      paramContext.cJb = System.currentTimeMillis();
      paramContext.text = "测试测试";
      try
      {
        paramContext.uaU = Integer.valueOf(paramArrayOfString[2]).intValue();
        paramContext.type = Integer.valueOf(paramArrayOfString[3]).intValue();
        paramContext.xgB = System.currentTimeMillis();
        paramContext.fRS = 300L;
        paramContext.xgz = (System.currentTimeMillis() / 1000L);
        paramContext.uaW = 1;
        if (paramContext.type == 8)
        {
          ((PluginTopStory)g.M(PluginTopStory.class)).getRedDotMgr();
          com.tencent.mm.plugin.topstory.b.abx("testmsgid000");
        }
      }
      catch (Exception paramArrayOfString)
      {
        while (true)
        {
          paramContext.uaU = 2;
          paramContext.type = 1;
        }
        if (paramContext.type == 7)
        {
          ((PluginTopStory)g.M(PluginTopStory.class)).getRedDotMgr().b(paramContext);
          continue;
        }
        if (paramContext.type == 10)
        {
          ((PluginTopStory)g.M(PluginTopStory.class)).getRedDotMgr().m("111111", "{\"globalId\":\"assistant_my_colike\"}", System.currentTimeMillis() / 1000L);
          continue;
        }
        ((PluginTopStory)g.M(PluginTopStory.class)).getRedDotMgr().a(paramContext);
      }
      continue;
      ((PluginTopStory)g.M(PluginTopStory.class)).getRedDotMgr().Fx(1);
      ((PluginTopStory)g.M(PluginTopStory.class)).getRedDotMgr().Fx(7);
      ((PluginTopStory)g.M(PluginTopStory.class)).getRedDotMgr().Fx(8);
      g.RP().Ry().set(ac.a.xUH, Long.valueOf(0L));
      g.RP().Ry().set(ac.a.xUI, Long.valueOf(0L));
      g.RP().Ry().set(ac.a.xUJ, Integer.valueOf(0));
      continue;
      g.RP().Ry().set(ac.a.xVW, Long.valueOf(0L));
      g.RP().Ry().dsb();
      continue;
      paramString = ((PluginTopStory)g.M(PluginTopStory.class)).getRedDotMgr().cEW();
      if (paramString != null)
      {
        paramContext = ah.getContext();
        paramArrayOfString = new StringBuilder("count:").append(((PluginTopStory)g.M(PluginTopStory.class)).getRedDotMgr().cEU()).append("cmt: ");
        ((PluginTopStory)g.M(PluginTopStory.class)).getRedDotMgr();
        paramArrayOfString = paramArrayOfString.append(com.tencent.mm.plugin.topstory.b.d(paramString)).append("ts:");
        ((PluginTopStory)g.M(PluginTopStory.class)).getRedDotMgr();
        t.makeText(paramContext, com.tencent.mm.plugin.topstory.b.cEZ(), 0).show();
      }
      else
      {
        paramArrayOfString = ah.getContext();
        paramContext = new StringBuilder("no cmtrdts:");
        ((PluginTopStory)g.M(PluginTopStory.class)).getRedDotMgr();
        t.makeText(paramArrayOfString, com.tencent.mm.plugin.topstory.b.cEZ(), 0).show();
        continue;
        paramArrayOfString = ((PluginTopStory)g.M(PluginTopStory.class)).getRedDotMgr().sAm;
        if (paramArrayOfString != null)
        {
          paramContext = ah.getContext();
          paramString = new StringBuilder("cnt: ");
          ((PluginTopStory)g.M(PluginTopStory.class)).getRedDotMgr();
          t.makeText(paramContext, com.tencent.mm.plugin.topstory.b.d(paramArrayOfString), 0).show();
        }
        else
        {
          t.makeText(ah.getContext(), "no cntrd", 0).show();
          continue;
          try
          {
            paramArrayOfString = new java/lang/StringBuilder;
            paramArrayOfString.<init>();
            paramString = com.tencent.mm.vfs.e.cy(com.tencent.mm.compatible.util.e.eSn + "topstory/trace.info");
            paramArrayOfString = new android/widget/TextView;
            paramArrayOfString.<init>(paramContext);
            paramArrayOfString.setText(paramString);
            paramArrayOfString.setGravity(19);
            paramArrayOfString.setTextSize(1, 10.0F);
            paramString = new android/view/ViewGroup$LayoutParams;
            paramString.<init>(-1, -2);
            paramArrayOfString.setLayoutParams(paramString);
            paramArrayOfString.setTextColor(-16711936);
            paramArrayOfString.setTypeface(Typeface.MONOSPACE);
            i = paramContext.getResources().getDimensionPixelSize(2131427776);
            paramArrayOfString.setPadding(i, i, i, i);
            paramArrayOfString.setMovementMethod(ScrollingMovementMethod.getInstance());
            h.a(paramContext, null, paramArrayOfString, null);
          }
          catch (Exception paramContext)
          {
          }
          continue;
          com.tencent.mm.vfs.e.N(aa.HQ(1).aLD(), true);
          Process.killProcess(Process.myPid());
          continue;
          paramContext = new Intent(ah.getContext(), TopStoryDebugUI.class);
          ah.getContext().startActivity(paramContext);
          continue;
          g.RP().Ry().set(ac.a.xVN, Integer.valueOf(0));
          g.RP().Ry().set(ac.a.xVO, Integer.valueOf(0));
          continue;
          g.RP().Ry().set(ac.a.xUO, Integer.valueOf(0));
          g.RP().Ry().dsb();
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.b
 * JD-Core Version:    0.6.2
 */