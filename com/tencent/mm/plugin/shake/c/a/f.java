package com.tencent.mm.plugin.shake.c.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ql;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class f
{
  public List<WeakReference<a>> kaD;
  private String qsx;

  public f()
  {
    AppMethodBeat.i(24519);
    this.kaD = new ArrayList();
    this.qsx = "";
    this.qsx = com.tencent.mm.plugin.shake.c.c.a.cko();
    AppMethodBeat.o(24519);
  }

  private static f.b WD(String paramString)
  {
    AppMethodBeat.i(24522);
    Object localObject = br.z(paramString, "sysmsg");
    if (localObject == null)
    {
      paramString = null;
      AppMethodBeat.o(24522);
      return paramString;
    }
    paramString = new f.b();
    String str = (String)((Map)localObject).get(".sysmsg.begintime");
    if ((!TextUtils.isEmpty(str)) && (isNumeric(str)))
    {
      paramString.qsy = Integer.valueOf(str).intValue();
      label72: str = (String)((Map)localObject).get(".sysmsg.endtime");
      if ((TextUtils.isEmpty(str)) || (!isNumeric(str)))
        break label295;
      paramString.qsz = Integer.valueOf(str).intValue();
      label109: paramString.qsA = ((String)((Map)localObject).get(".sysmsg.entrancename"));
      str = (String)((Map)localObject).get(".sysmsg.activitytype");
      if ((TextUtils.isEmpty(str)) || (!isNumeric(str)))
        break label317;
      paramString.qsB = Integer.valueOf(str).intValue();
      label161: ab.i("MicroMsg.ShakeCardMsgMgr", "parseEntrancedMsgFromMsgXml activitytype is ".concat(String.valueOf(str)));
      str = (String)((Map)localObject).get(".sysmsg.flowcontrollevelmin");
      if ((TextUtils.isEmpty(str)) || (!isNumeric(str)))
        break label325;
      paramString.qsC = Integer.valueOf(str).intValue();
      label212: paramString.qsE = ((String)((Map)localObject).get(".sysmsg.shakecardentrancetip"));
      localObject = (String)((Map)localObject).get(".sysmsg.flowcontrollevelmax");
      if ((TextUtils.isEmpty((CharSequence)localObject)) || (!isNumeric((String)localObject)))
        break label347;
    }
    for (paramString.qsD = Integer.valueOf((String)localObject).intValue(); ; paramString.qsD = 0)
    {
      AppMethodBeat.o(24522);
      break;
      ab.e("MicroMsg.ShakeCardMsgMgr", "parseEntrancedMsgFromMsgXml begintime is ".concat(String.valueOf(str)));
      paramString.qsy = 0;
      break label72;
      label295: ab.e("MicroMsg.ShakeCardMsgMgr", "parseEntrancedMsgFromMsgXml endtime is ".concat(String.valueOf(str)));
      paramString.qsz = 0;
      break label109;
      label317: paramString.qsB = 1;
      break label161;
      label325: ab.e("MicroMsg.ShakeCardMsgMgr", "parseEntrancedMsgFromMsgXml flowcontrollevelmin is ".concat(String.valueOf(str)));
      paramString.qsC = 0;
      break label212;
      label347: ab.e("MicroMsg.ShakeCardMsgMgr", "parseEntrancedMsgFromMsgXml flowcontrollevelmax is ".concat(String.valueOf(localObject)));
    }
  }

  private static f.d WE(String paramString)
  {
    AppMethodBeat.i(24524);
    Map localMap = br.z(paramString, "sysmsg");
    if (localMap == null)
    {
      paramString = null;
      AppMethodBeat.o(24524);
    }
    while (true)
    {
      return paramString;
      paramString = new f.d();
      paramString.qsF = ((String)localMap.get(".sysmsg.reddotid"));
      paramString.qsG = ((String)localMap.get(".sysmsg.reddotdesc"));
      paramString.qsH = ((String)localMap.get(".sysmsg.reddottext"));
      AppMethodBeat.o(24524);
    }
  }

  private static void a(f.b paramb)
  {
    AppMethodBeat.i(24523);
    if (paramb == null)
    {
      ab.e("MicroMsg.ShakeCardMsgMgr", "saveEntranceMsg msg == null");
      AppMethodBeat.o(24523);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.ShakeCardMsgMgr", "saveEntranceMsg msg");
      if (!com.tencent.mm.plugin.shake.c.c.a.cjN())
        ab.i("MicroMsg.ShakeCardMsgMgr", "saveEntranceMsg isShakeCardEntranceOpen is false");
      ab.i("MicroMsg.ShakeCardMsgMgr", "saveEntranceMsg begintime:" + paramb.qsy + "  endtime:" + paramb.qsz + "  flowlevelmin:" + paramb.qsC + "  flowlevelmax:" + paramb.qsD + " entrancename:" + paramb.qsA + " activitytype:" + paramb.qsB);
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(ac.a.xIN, Integer.valueOf(paramb.qsy));
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(ac.a.xIO, Integer.valueOf(paramb.qsz));
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(ac.a.xIP, paramb.qsA);
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(ac.a.xIT, Integer.valueOf(paramb.qsB));
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(ac.a.xIQ, Integer.valueOf(paramb.qsC));
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(ac.a.xIR, Integer.valueOf(paramb.qsD));
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(ac.a.xIS, paramb.qsE);
      AppMethodBeat.o(24523);
    }
  }

  private void a(f.d paramd)
  {
    AppMethodBeat.i(24525);
    if (paramd == null)
    {
      ab.e("MicroMsg.ShakeCardMsgMgr", "saveRedDotMsg msg == null");
      AppMethodBeat.o(24525);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.ShakeCardMsgMgr", "saveRedDotMsg msg reddotid is " + paramd.qsF);
      ab.i("MicroMsg.ShakeCardMsgMgr", "saveRedDotMsg pre reddotid is " + this.qsx);
      if (TextUtils.isEmpty(paramd.qsF))
      {
        ab.i("MicroMsg.ShakeCardMsgMgr", "msg.reddotid is empty");
        AppMethodBeat.o(24525);
      }
      else if (TextUtils.isEmpty(this.qsx))
      {
        ab.i("MicroMsg.ShakeCardMsgMgr", "redDotId is empty, msg.reddotid is not empty");
        com.tencent.mm.x.c.PK().y(262154, true);
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(ac.a.xIU, paramd.qsF);
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(ac.a.xIV, paramd.qsG);
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(ac.a.xIW, paramd.qsH);
        aVU();
        AppMethodBeat.o(24525);
      }
      else if (!this.qsx.equals(paramd.qsF))
      {
        ab.i("MicroMsg.ShakeCardMsgMgr", "redDotId and msg.reddotid is not empty, but no equals");
        com.tencent.mm.x.c.PK().y(262154, true);
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(ac.a.xIU, paramd.qsF);
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(ac.a.xIV, paramd.qsG);
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(ac.a.xIW, paramd.qsH);
        aVU();
        AppMethodBeat.o(24525);
      }
      else
      {
        if (this.qsx.equals(paramd.qsF))
          ab.i("MicroMsg.ShakeCardMsgMgr", "redDotId equals msg.reddotid");
        AppMethodBeat.o(24525);
      }
    }
  }

  private void aVU()
  {
    AppMethodBeat.i(24527);
    if (this.kaD == null)
      AppMethodBeat.o(24527);
    while (true)
    {
      return;
      for (int i = 0; i < this.kaD.size(); i++)
      {
        Object localObject = (WeakReference)this.kaD.get(i);
        if (localObject != null)
        {
          localObject = (a)((WeakReference)localObject).get();
          if (localObject != null)
            ((a)localObject).ckb();
        }
      }
      AppMethodBeat.o(24527);
    }
  }

  private static void cka()
  {
    AppMethodBeat.i(24521);
    ql localql = new ql();
    com.tencent.mm.sdk.b.a.xxA.m(localql);
    AppMethodBeat.o(24521);
  }

  private static boolean isNumeric(String paramString)
  {
    AppMethodBeat.i(24526);
    boolean bool = Pattern.compile("[0-9]*").matcher(paramString).matches();
    AppMethodBeat.o(24526);
    return bool;
  }

  public final void i(String paramString, long paramLong, int paramInt)
  {
    AppMethodBeat.i(24520);
    ab.i("MicroMsg.ShakeCardMsgMgr", "msg_id is ".concat(String.valueOf(paramLong)));
    if (TextUtils.isEmpty(paramString))
    {
      ab.e("MicroMsg.ShakeCardMsgMgr", "onReceive() msgText is empty");
      AppMethodBeat.o(24520);
      return;
    }
    if (paramInt == 0)
    {
      ab.i("MicroMsg.ShakeCardMsgMgr", "onReceive() msgText is MSG_TYPE_ENTRANCE");
      a(WD(paramString));
      cka();
    }
    while (true)
    {
      com.tencent.mm.plugin.shake.c.c.a.cjM();
      AppMethodBeat.o(24520);
      break;
      if (paramInt == 1)
      {
        ab.i("MicroMsg.ShakeCardMsgMgr", "onReceive() msgText is MSG_TYPE_RED_DOT");
        a(WE(paramString));
        cka();
      }
    }
  }

  public static abstract interface a
  {
    public abstract void ckb();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.c.a.f
 * JD-Core Version:    0.6.2
 */