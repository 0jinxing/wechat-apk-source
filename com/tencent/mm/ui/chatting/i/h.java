package com.tencent.mm.ui.chatting.i;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView.v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.chatting.a.c.e;
import com.tencent.mm.ui.chatting.e.b.b;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class h extends b
{
  int eot;
  HashSet<Integer> yZA;
  int yZg;

  public h(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(32648);
    this.yZA = new HashSet();
    this.eot = -1;
    this.yZg = 0;
    AppMethodBeat.o(32648);
  }

  private boolean a(bi parambi, f paramf)
  {
    AppMethodBeat.i(32656);
    boolean bool;
    if ((!parambi.field_talker.endsWith("@qqim")) || (!paramf.field_packageName.equals("com.tencent.mobileqq")))
    {
      AppMethodBeat.o(32656);
      bool = false;
      return bool;
    }
    ab.d("MicroMsg.UrlHistoryListPresenter", "jacks open QQ");
    parambi = new Intent("android.intent.action.MAIN", null);
    parambi.addCategory("android.intent.category.LAUNCHER");
    parambi.addFlags(268435456);
    parambi.setClassName("com.tencent.mobileqq", aO(this.mContext, "com.tencent.mobileqq"));
    parambi.putExtra("platformId", "wechat");
    aw.ZK();
    paramf = com.tencent.mm.model.c.Ry().get(9, null);
    if ((paramf != null) && ((paramf instanceof Integer)));
    for (int i = ((Integer)paramf).intValue(); ; i = 0)
      while (true)
      {
        if (i != 0);
        try
        {
          byte[] arrayOfByte = String.valueOf(i).getBytes("utf-8");
          paramf = "asdfghjkl;'".getBytes("utf-8");
          int j = paramf.length;
          int k = 0;
          for (i = 0; k < j; i++)
          {
            int m = paramf[k];
            if (i >= arrayOfByte.length)
              break;
            arrayOfByte[i] = ((byte)(byte)(m ^ arrayOfByte[i]));
            k++;
          }
          parambi.putExtra("tencent_gif", arrayOfByte);
        }
        catch (UnsupportedEncodingException paramf)
        {
          try
          {
            while (true)
            {
              this.mContext.startActivity(parambi);
              label243: bool = true;
              AppMethodBeat.o(32656);
              break;
              paramf = paramf;
              ab.printErrStackTrace("MicroMsg.UrlHistoryListPresenter", paramf, "", new Object[0]);
            }
          }
          catch (Exception parambi)
          {
            break label243;
          }
        }
      }
  }

  private static String aO(Context paramContext, String paramString)
  {
    AppMethodBeat.i(32657);
    paramContext = paramContext.getPackageManager();
    try
    {
      PackageInfo localPackageInfo = paramContext.getPackageInfo(paramString, 0);
      paramString = new android/content/Intent;
      paramString.<init>("android.intent.action.MAIN", null);
      paramString.addCategory("android.intent.category.LAUNCHER");
      paramString.setPackage(localPackageInfo.packageName);
      paramContext = (ResolveInfo)paramContext.queryIntentActivities(paramString, 0).iterator().next();
      if (paramContext != null)
      {
        paramContext = paramContext.activityInfo.name;
        AppMethodBeat.o(32657);
        return paramContext;
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.UrlHistoryListPresenter", paramContext, "", new Object[0]);
        paramContext = null;
      }
    }
  }

  private static PackageInfo getPackageInfo(Context paramContext, String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(32658);
    if ((paramString == null) || (paramString.length() == 0))
    {
      paramString = null;
      if (paramString != null)
        break label58;
      AppMethodBeat.o(32658);
      paramContext = localObject;
    }
    while (true)
    {
      return paramContext;
      paramString = com.tencent.mm.pluginsdk.model.app.g.bT(paramString, true);
      if (paramString == null)
      {
        paramString = null;
        break;
      }
      paramString = paramString.field_packageName;
      break;
      try
      {
        label58: paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0);
        AppMethodBeat.o(32658);
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        ab.printErrStackTrace("MicroMsg.UrlHistoryListPresenter", paramContext, "", new Object[0]);
        AppMethodBeat.o(32658);
        paramContext = localObject;
      }
    }
  }

  public final void a(com.tencent.mm.ui.chatting.a.c.a parama, int paramInt)
  {
    AppMethodBeat.i(32655);
    b localb = (b)parama;
    h.a locala = (h.a)Oy(paramInt);
    if ((bo.isNullOrNil(locala.desc)) || (!bo.isNullOrNil(locala.source)))
    {
      localb.gnC.setVisibility(8);
      Bitmap localBitmap = o.ahl().a(locala.imagePath, com.tencent.mm.bz.a.getDensity(this.mContext), false);
      if (localBitmap != null)
      {
        parama = localBitmap;
        if (!localBitmap.isRecycled())
          break label272;
      }
      localBitmap = com.tencent.mm.pluginsdk.model.app.g.b(locala.appId, 1, com.tencent.mm.bz.a.getDensity(this.mContext));
      if (localBitmap != null)
      {
        parama = localBitmap;
        if (!localBitmap.isRecycled())
          break label272;
      }
      parama = new com.tencent.mm.at.a.a.c.a();
      parama.ePT = 2131689876;
      parama.ePG = true;
      parama.ePJ = q.v(locala.imagePath, locala.type, "@T");
      parama.ct(com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 50), com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 50)).ePF = true;
      o.ahp().a(locala.imagePath, localb.iqT, parama.ahG());
    }
    while (true)
    {
      localb.moL.setText(bo.bc(locala.source, ""));
      b.c(localb.moL, this.yYZ.yNK);
      AppMethodBeat.o(32655);
      return;
      localb.gnC.setVisibility(0);
      localb.gnC.setText(bo.bc(locala.desc, ""));
      break;
      label272: localb.iqT.setImageBitmap(parama);
    }
  }

  public final String aoy()
  {
    AppMethodBeat.i(32651);
    String str = this.mContext.getString(2131296507);
    AppMethodBeat.o(32651);
    return str;
  }

  public final void dFH()
  {
    AppMethodBeat.i(32650);
    this.yYY.dFL();
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RS().aa(new h.1(this));
    AppMethodBeat.o(32650);
  }

  public final c.e dFI()
  {
    AppMethodBeat.i(32653);
    h.2 local2 = new h.2(this);
    AppMethodBeat.o(32653);
    return local2;
  }

  public final String dFK()
  {
    AppMethodBeat.i(32652);
    String str = this.mContext.getString(2131296507);
    AppMethodBeat.o(32652);
    return str;
  }

  public final int getType()
  {
    AppMethodBeat.i(32649);
    this.yZA.add(Integer.valueOf(5));
    this.yZA.add(Integer.valueOf(7));
    this.yZA.add(Integer.valueOf(27));
    this.yZA.add(Integer.valueOf(26));
    this.yZA.add(Integer.valueOf(15));
    AppMethodBeat.o(32649);
    return -1;
  }

  public final RecyclerView.v v(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(32654);
    paramViewGroup = new b(LayoutInflater.from(paramViewGroup.getContext()).inflate(2130970983, paramViewGroup, false));
    AppMethodBeat.o(32654);
    return paramViewGroup;
  }

  final class b extends com.tencent.mm.ui.chatting.a.c.a
  {
    TextView gnC;
    ImageView iqT;
    TextView moL;

    public b(View arg2)
    {
      super();
      AppMethodBeat.i(32647);
      this.iqT = ((ImageView)localView.findViewById(2131821479));
      this.gnC = ((TextView)localView.findViewById(2131820602));
      this.moL = ((TextView)localView.findViewById(2131820615));
      this.moL.setVisibility(0);
      AppMethodBeat.o(32647);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.h
 * JD-Core Version:    0.6.2
 */