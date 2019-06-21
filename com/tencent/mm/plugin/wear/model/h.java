package com.tencent.mm.plugin.wear.model;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ah.o;
import com.tencent.mm.g.a.ui;
import com.tencent.mm.g.a.ui.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.modelvoice.n;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.i.a;
import com.tencent.mm.protocal.protobuf.ctl;
import com.tencent.mm.protocal.protobuf.cuc;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.a;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.vfs.e;
import com.tencent.mm.vfs.j;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class h
{
  public static boolean OX()
  {
    boolean bool = true;
    AppMethodBeat.i(26343);
    PackageManager localPackageManager = ah.getContext().getPackageManager();
    try
    {
      localPackageManager.getPackageInfo("com.google.android.wearable.app.cn", 1);
      AppMethodBeat.o(26343);
      return bool;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
        bool = false;
    }
  }

  public static boolean OY()
  {
    boolean bool = true;
    AppMethodBeat.i(26344);
    PackageManager localPackageManager = ah.getContext().getPackageManager();
    try
    {
      localPackageManager.getPackageInfo("com.google.android.wearable.app", 1);
      AppMethodBeat.o(26344);
      return bool;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
        bool = false;
    }
  }

  public static byte[] ad(Bitmap paramBitmap)
  {
    AppMethodBeat.i(26342);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
    paramBitmap = localByteArrayOutputStream.toByteArray();
    AppMethodBeat.o(26342);
    return paramBitmap;
  }

  public static final Bitmap adv(String paramString)
  {
    AppMethodBeat.i(26339);
    Bitmap localBitmap = a.b.diS().cQ(paramString);
    if (localBitmap == null)
    {
      o.acd();
      paramString = com.tencent.mm.ah.d.D(paramString, false);
      ab.d("MicroMsg.Wear.WearUtil", "avatar fullpath: %s", new Object[] { paramString });
    }
    for (paramString = com.tencent.mm.ah.d.qi(paramString); ; paramString = localBitmap)
    {
      AppMethodBeat.o(26339);
      return paramString;
      ab.d("MicroMsg.Wear.WearUtil", "get wear avatar from cache: %s", new Object[] { paramString });
    }
  }

  public static String adw(String paramString)
  {
    AppMethodBeat.i(26340);
    aw.ZK();
    ad localad = c.XM().aoO(paramString);
    String str;
    if (t.kH(paramString))
    {
      str = ah.getContext().getString(2131298223);
      paramString = s.a(localad, paramString);
      if ((localad.field_username.equals(paramString)) || (bo.isNullOrNil(paramString)))
        break label77;
    }
    while (true)
    {
      AppMethodBeat.o(26340);
      return paramString;
      paramString = s.a(localad, paramString);
      continue;
      label77: paramString = str;
    }
  }

  public static byte[] adx(String paramString)
  {
    AppMethodBeat.i(26345);
    paramString = "lib" + paramString + ".so";
    paramString = e.e(j.w(new com.tencent.mm.vfs.b(new com.tencent.mm.vfs.b(com.tencent.mm.loader.j.b.eSi, "lib"), paramString).dMD()), 0, -1);
    AppMethodBeat.o(26345);
    return paramString;
  }

  public static cuc aj(bi parambi)
  {
    AppMethodBeat.i(26341);
    cuc localcuc = new cuc();
    localcuc.vIs = parambi.field_msgId;
    localcuc.vIv = parambi.field_createTime;
    localcuc.nao = 1;
    localcuc.xqD = true;
    Object localObject1;
    Object localObject2;
    label89: int i;
    if (parambi.field_isSend == 1)
    {
      localcuc.wCW = adw(r.Yz());
      localcuc.wyw = r.Yz();
      localObject1 = null;
      if (parambi.isSystem())
      {
        localObject2 = ah.getContext().getString(2131301829);
        localcuc.nao = 3;
        parambi = (bi)localObject2;
        if (localObject2 == null)
          parambi = ah.getContext().getString(2131301822);
        localcuc.ncM = parambi;
        AppMethodBeat.o(26341);
        return localcuc;
      }
    }
    else if (t.kH(parambi.field_talker))
    {
      localObject2 = parambi.field_talker;
      i = bf.ox(parambi.field_content);
      if (i == -1)
        break label1525;
      localObject1 = parambi.field_content.substring(0, i).trim();
      if ((localObject1 == null) || (((String)localObject1).length() <= 0))
        break label1525;
      localObject2 = localObject1;
    }
    label1174: label1219: label1522: label1525: 
    while (true)
    {
      while (true)
      {
        localcuc.wCW = adw((String)localObject2);
        localcuc.wyw = ((String)localObject2);
        break;
        localcuc.wCW = adw(parambi.field_talker);
        localcuc.wyw = parambi.field_talker;
        break;
        if (parambi.drE())
        {
          localObject2 = ah.getContext().getString(2131301795);
          localcuc.nao = 4;
          break label89;
        }
        if (parambi.isText())
        {
          if ((t.kH(parambi.field_talker)) && (parambi.field_isSend != 1))
          {
            i = bf.ox(parambi.field_content);
            if (i != -1)
            {
              localObject2 = parambi.field_content.substring(i + 1).trim();
              break label89;
            }
            localObject2 = parambi.field_content;
            break label89;
          }
          localObject2 = parambi.field_content;
          break label89;
        }
        if (parambi.drD())
        {
          localObject2 = ah.getContext().getString(2131301831);
          localcuc.nao = 6;
          localcuc.xqD = q.K(parambi);
          float f = q.fY(new n(parambi.field_content).time);
          localcuc.xqE = new com.tencent.mm.bt.b(ah.getContext().getString(2131300005, new Object[] { Integer.valueOf((int)f) }).getBytes());
          break label89;
        }
        if (parambi.bws())
        {
          localObject2 = ah.getContext().getString(2131301830);
          break label89;
        }
        if (parambi.bwt())
        {
          localObject2 = ah.getContext().getString(2131301821);
          break label89;
        }
        if (parambi.dtp())
        {
          j.b localb = j.b.me(parambi.field_content);
          localObject2 = localObject1;
          if (localb == null)
            break label89;
          if (localb.fhZ.startsWith("wxpay://c2cbizmessagehandler/hongbao/receivehongbao"))
          {
            localcuc.nao = 5;
            if (parambi.field_isSend == 1)
            {
              localObject2 = localb.fhT;
              break label89;
            }
            localObject2 = localb.fhS;
            break label89;
          }
          if (parambi.field_isSend == 1);
          for (parambi = localb.fhT; ; parambi = localb.fhS)
          {
            localObject2 = ah.getContext().getString(2131301776, new Object[] { parambi });
            break;
          }
        }
        if (parambi.dtq())
        {
          localObject2 = ah.getContext().getString(2131301775);
          localcuc.nao = 5;
          break label89;
        }
        if (parambi.bAA())
        {
          parambi = j.b.me(parambi.field_content);
          localObject2 = localObject1;
          if (parambi == null)
            break label89;
          switch (parambi.type)
          {
          case 7:
          case 9:
          case 11:
          case 12:
          case 14:
          case 17:
          case 18:
          default:
            localObject2 = localObject1;
            break;
          case 2:
            localObject2 = String.format(ah.getContext().getString(2131301795), new Object[0]);
            break;
          case 5:
            localObject2 = String.format(ah.getContext().getString(2131301766), new Object[] { bo.bc(parambi.title, "") });
            break;
          case 3:
            localObject2 = String.format(ah.getContext().getString(2131301769), new Object[] { bo.bc(parambi.title, "") });
            break;
          case 6:
            localObject2 = String.format(ah.getContext().getString(2131301765), new Object[] { bo.bc(parambi.title, "") });
            break;
          case 4:
            localObject2 = String.format(ah.getContext().getString(2131301773), new Object[] { bo.bc(parambi.title, "") });
            break;
          case 19:
            localObject2 = String.format(ah.getContext().getString(2131301771), new Object[] { bo.bc(parambi.title, "") });
            break;
          case 15:
            localObject2 = String.format(ah.getContext().getString(2131301764), new Object[] { bo.bc(parambi.title, "") });
            break;
          case 10:
            localObject2 = String.format(ah.getContext().getString(2131301770), new Object[] { bo.bc(parambi.title, "") });
            break;
          case 13:
            localObject2 = String.format(ah.getContext().getString(2131301768), new Object[] { bo.bc(parambi.title, "") });
            break;
          case 20:
            localObject2 = String.format(ah.getContext().getString(2131301772), new Object[] { bo.bc(parambi.title, "") });
            break;
          case 16:
            localObject2 = String.format(ah.getContext().getString(2131301777), new Object[] { bo.bc(parambi.title, "") });
            break;
          case 8:
            localObject2 = ah.getContext().getString(2131301778, new Object[] { bo.bc(parambi.title, "") });
            break;
          }
        }
        if (parambi.dtx())
        {
          localObject2 = ah.getContext().getString(2131301784);
          if (((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr() == null)
            break label1522;
          parambi = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(parambi.field_imgPath);
          if (bo.isNullOrNil(((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jh(parambi.Aq())))
          {
            localObject2 = ah.getContext().getString(2131301784);
            localObject1 = new ctl();
            ((ctl)localObject1).wdO = parambi.Aq();
            if (!parambi.isGif())
              break label1276;
            ((ctl)localObject1).jCt = 1;
          }
        }
        try
        {
          while (true)
          {
            parambi = new com/tencent/mm/bt/b;
            parambi.<init>(((ctl)localObject1).toByteArray());
            localcuc.xqE = parambi;
            localcuc.nao = 2;
            break;
            localObject2 = "[" + ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jh(parambi.Aq()) + "]";
            break label1174;
            label1276: ((ctl)localObject1).jCt = 2;
          }
          if (parambi.bAC())
          {
            localObject2 = ah.getContext().getString(2131301796);
            break label89;
          }
          if ((!parambi.dts()) && (!parambi.dtt()))
          {
            if (parambi.getType() == 64)
            {
              i = 1;
              if (i == 0)
                break label1442;
            }
          }
          else if (!parambi.field_content.equals(bi.xZb))
          {
            parambi = parambi.field_content;
            localObject2 = new ui();
            ((ui)localObject2).cQx.cAd = 1;
            ((ui)localObject2).cQx.content = parambi;
            a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
            if (((ui)localObject2).cQy.type != 3)
              break label1423;
          }
          for (i = 1; ; i = 0)
          {
            if (i == 0)
              break label1429;
            localObject2 = ah.getContext().getString(2131301833);
            break;
            i = 0;
            break label1330;
          }
          localObject2 = ah.getContext().getString(2131301832);
          break label89;
          if (parambi.dtw())
          {
            aw.ZK();
            parambi = c.XO().Rn(parambi.field_content);
            localObject2 = String.format(ah.getContext().getString(2131301777), new Object[] { parambi.getDisplayName() });
            break label89;
          }
          localObject2 = localObject1;
          if (parambi.getType() != -1879048186)
            break label89;
          localObject2 = ah.getContext().getString(2131301767);
        }
        catch (IOException parambi)
        {
          break label1219;
        }
      }
      break label89;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.h
 * JD-Core Version:    0.6.2
 */