package com.tencent.mm.plugin.hp.b;

import android.content.Context;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.boots.a.c;
import com.tencent.mm.plugin.hp.d.d;
import com.tencent.mm.protocal.protobuf.bhv;
import com.tencent.mm.protocal.protobuf.bhy;
import com.tencent.mm.protocal.protobuf.bia;
import com.tencent.mm.protocal.protobuf.bsz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class g
  implements com.tencent.mm.pluginsdk.cmd.a
{
  private static void bGm()
  {
    AppMethodBeat.i(90612);
    Object localObject = ((c)com.tencent.mm.kernel.g.K(c.class)).aVJ();
    if (!((List)localObject).isEmpty())
    {
      ab.e("MicroMsg.Tinker.TinkerBootsCommand", "start day active keys");
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        com.tencent.mm.plugin.boots.a.a locala = (com.tencent.mm.plugin.boots.a.a)((Iterator)localObject).next();
        ab.i("MicroMsg.Tinker.TinkerBootsCommand", "key:%s active:%d", new Object[] { Integer.toHexString(locala.field_key), Integer.valueOf(locala.field_dau) });
      }
    }
    AppMethodBeat.o(90612);
  }

  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    AppMethodBeat.i(90611);
    boolean bool;
    if (paramArrayOfString.length < 2)
    {
      ab.d("MicroMsg.Tinker.TinkerBootsCommand", "no args input.");
      bool = false;
      AppMethodBeat.o(90611);
      label26: return bool;
    }
    paramContext = paramArrayOfString[1];
    int i;
    if (com.tencent.mm.sdk.a.b.dnO())
    {
      i = -1;
      switch (paramContext.hashCode())
      {
      default:
      case -838846263:
      case 3529469:
      case 3083269:
      case 3089570:
      case 3510:
      case 94746189:
      case -309518737:
      case 2067292548:
      }
    }
    while (true)
      switch (i)
      {
      default:
        ab.d("MicroMsg.Tinker.TinkerBootsCommand", "%s is not a debugger command.", new Object[] { paramContext });
        i = -1;
        switch (paramContext.hashCode())
        {
        default:
          switch (i)
          {
          default:
            label208: ab.d("MicroMsg.Tinker.TinkerBootsCommand", "%s is not a release command.", new Object[] { paramContext });
            bool = false;
            AppMethodBeat.o(90611);
            break label26;
            if (paramContext.equals("update"))
            {
              i = 0;
              continue;
              if (paramContext.equals("show"))
              {
                i = 1;
                continue;
                if (paramContext.equals("diff"))
                {
                  i = 2;
                  continue;
                  if (paramContext.equals("down"))
                  {
                    i = 3;
                    continue;
                    if (paramContext.equals("nd"))
                    {
                      i = 4;
                      continue;
                      if (paramContext.equals("clear"))
                      {
                        i = 5;
                        continue;
                        if (paramContext.equals("process"))
                        {
                          i = 6;
                          continue;
                          if (paramContext.equals("showall"))
                            i = 7;
                        }
                      }
                    }
                  }
                }
              }
            }
            break;
          case 0:
          }
          break;
        case 94627080:
        }
        break;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      }
    ab.d("MicroMsg.Tinker.TinkerBootsCommand", "command checkout update.");
    LinkedList localLinkedList = new LinkedList();
    paramString = "";
    if (paramArrayOfString.length >= 3);
    for (paramContext = paramArrayOfString[2]; ; paramContext = "tinker_id_d1ddc930233f0ec33f573e365038b6d979b6ebde")
      while (true)
      {
        if (paramArrayOfString.length >= 4)
          paramString = paramArrayOfString[3];
        Object localObject;
        if (paramArrayOfString.length >= 5)
        {
          localObject = new bhv();
          ((bhv)localObject).key = "sdk";
          ((bhv)localObject).value = paramArrayOfString[4];
          localLinkedList.add(localObject);
        }
        StringBuilder localStringBuilder;
        while (true)
        {
          localStringBuilder = new StringBuilder();
          localObject = localLinkedList.iterator();
          while (((Iterator)localObject).hasNext())
          {
            paramArrayOfString = (bhv)((Iterator)localObject).next();
            localStringBuilder.append(paramArrayOfString.key).append(":").append(paramArrayOfString.value).append("\n");
          }
          paramArrayOfString = new bhv();
          paramArrayOfString.key = "sdk";
          paramArrayOfString.value = String.valueOf(Build.VERSION.SDK_INT);
          localLinkedList.add(paramArrayOfString);
        }
        ab.d("MicroMsg.Tinker.TinkerBootsCommand", "BaseID:%s PatchID:%s %s", new Object[] { paramContext, paramString, localStringBuilder.toString() });
        paramContext = new com.tencent.mm.plugin.hp.c.b(paramContext, paramString, localLinkedList);
        com.tencent.mm.kernel.g.Rg().a(paramContext, 0);
        bool = true;
        AppMethodBeat.o(90611);
        break;
        i.a(ah.getContext().getString(2131300006), ah.getContext().getString(2131300006), ah.getContext().getString(2131300625), new g.1(this), ah.getContext().getString(2131304158), null);
        bool = true;
        AppMethodBeat.o(90611);
        break;
        com.tencent.mm.kernel.g.RS().aa(new g.2(this, paramArrayOfString));
        bool = true;
        AppMethodBeat.o(90611);
        break;
        paramContext = new bia();
        paramContext.wLn = 1000;
        paramContext.wLk = 2;
        paramContext.wLl = 2;
        paramContext.state = 2;
        paramContext.pdA = "android_tinker_id_123123131231231";
        paramArrayOfString = new bsz();
        paramArrayOfString.wdO = "c3282ad2467fad9561227bc9b5b6712c";
        paramArrayOfString.FileSize = 118617;
        paramArrayOfString.Url = "http://dldir1.qq.com/weixin/checkresupdate/0x2605136d.3144f5.0x26051334.bf52fb_1510754399.apk";
        paramContext.wLk = 3;
        paramArrayOfString.wdO = "3ba62fdbd98df2bdf5da7d726010d867";
        paramArrayOfString.FileSize = 33338711;
        paramArrayOfString.Url = "http://dldir1.qq.com/weixin/checkresupdate/0x26051363.6cc887.0x26051087.a44d04_1510750804.apk";
        paramContext.wLm = paramArrayOfString;
        new e(new com.tencent.mm.plugin.hp.d.b(paramContext)).jdMethod_if(false);
        bool = true;
        AppMethodBeat.o(90611);
        break;
        if (paramArrayOfString.length >= 6)
          bo.anl(paramArrayOfString[5]);
        bool = true;
        AppMethodBeat.o(90611);
        break;
        com.tencent.mm.plugin.hp.tinker.g.aA(ah.getContext(), "");
        com.tencent.mm.plugin.hp.tinker.g.aB(ah.getContext(), "");
        com.tencent.mm.plugin.hp.tinker.g.P(ah.getContext(), 0);
        ah.getContext();
        d.bGA();
        bool = true;
        AppMethodBeat.o(90611);
        break;
        paramContext = new bia();
        paramContext.wLn = 1000;
        paramContext.wLk = 3;
        paramContext.wLl = 2;
        paramContext.state = 2;
        paramContext.pdA = "android_tinker_id_123123131231231";
        paramArrayOfString = new bsz();
        paramArrayOfString.wdO = "3ba62fdbd98df2bdf5da7d726010d867";
        paramArrayOfString.FileSize = 33338711;
        paramArrayOfString.Url = "http://dldir1.qq.com/weixin/checkresupdate/0x26051363.6cc887.0x26051087.a44d04_1510750804.apk";
        paramContext.wLm = paramArrayOfString;
        paramArrayOfString = new bhy();
        paramArrayOfString.key = "clientVersion";
        paramArrayOfString.value = "0x26060510";
        paramContext.wLo.add(paramArrayOfString);
        paramArrayOfString = new bhy();
        paramArrayOfString.key = "alphaTitle";
        paramArrayOfString.value = "叫你更新你就更新";
        paramContext.wLo.add(paramArrayOfString);
        paramArrayOfString = new bhy();
        paramArrayOfString.key = "alphaContent";
        paramArrayOfString.value = "这个包可以抢到的红包最大，抢红包速度最快。";
        paramContext.wLo.add(paramArrayOfString);
        paramArrayOfString = new bhy();
        paramArrayOfString.key = "alphaUrl";
        paramArrayOfString.value = "www.qq.com";
        paramContext.wLo.add(paramArrayOfString);
        new e(new com.tencent.mm.plugin.hp.d.b(paramContext)).jdMethod_if(true);
        bool = true;
        AppMethodBeat.o(90611);
        break;
        bGm();
        bool = true;
        AppMethodBeat.o(90611);
        break;
        if (!paramContext.equals("check"))
          break label208;
        i = 0;
        break label208;
        try
        {
          com.tinkerboots.sdk.a.dWj().rF(true);
          bool = true;
          AppMethodBeat.o(90611);
        }
        catch (Exception paramContext)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.Tinker.TinkerBootsCommand", paramContext, "", new Object[0]);
        }
      }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.b.g
 * JD-Core Version:    0.6.2
 */