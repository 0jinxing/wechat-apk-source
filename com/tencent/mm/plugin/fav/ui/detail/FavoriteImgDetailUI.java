package com.tencent.mm.plugin.fav.ui.detail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.k;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.plugin.fav.ui.i;
import com.tencent.mm.plugin.fav.ui.l;
import com.tencent.mm.pluginsdk.f;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.MMLoadScrollView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

public class FavoriteImgDetailUI extends BaseFavDetailReportUI
  implements com.tencent.mm.plugin.fav.a.p
{
  private int aUQ;
  private com.tencent.mm.sdk.b.c mip;
  private View.OnClickListener mjE;
  private View.OnLongClickListener mlV;
  private LinearLayout mmi;
  private com.tencent.mm.plugin.fav.a.g mmj;
  private HashMap<String, FavoriteImgDetailUI.a> mmk;
  private Bitmap mml;
  private boolean mmm;

  public FavoriteImgDetailUI()
  {
    AppMethodBeat.i(74392);
    this.aUQ = 0;
    this.mmk = new HashMap();
    this.mmm = true;
    this.mjE = new FavoriteImgDetailUI.5(this);
    this.mlV = new FavoriteImgDetailUI.6(this);
    this.mip = new FavoriteImgDetailUI.2(this);
    AppMethodBeat.o(74392);
  }

  private void a(FavoriteImgDetailUI.a parama)
  {
    AppMethodBeat.i(74399);
    com.tencent.mm.kernel.g.RS().aa(new FavoriteImgDetailUI.4(this, parama));
    AppMethodBeat.o(74399);
  }

  public static void a(String paramString1, String paramString2, Context paramContext)
  {
    AppMethodBeat.i(74400);
    if (bo.isNullOrNil(paramString1))
    {
      ab.w("MicroMsg.FavoriteImgDetailUI", "save image fail, path is null");
      AppMethodBeat.o(74400);
    }
    while (true)
    {
      return;
      if (!com.tencent.mm.platformtools.q.a(paramString1, paramContext, 2131298807))
        Toast.makeText(paramContext, paramString2, 1).show();
      AppMethodBeat.o(74400);
    }
  }

  private void bwn()
  {
    AppMethodBeat.i(74397);
    if (ah.getResources() != null);
    for (DisplayMetrics localDisplayMetrics = ah.getResources().getDisplayMetrics(); ; localDisplayMetrics = getResources().getDisplayMetrics())
    {
      this.aUQ = (localDisplayMetrics.widthPixels - getResources().getDimensionPixelOffset(2131427652) * 2);
      this.aUQ = Math.max(this.aUQ, 0);
      ab.d("MicroMsg.FavoriteImgDetailUI", "update display width %d", new Object[] { Integer.valueOf(this.aUQ) });
      AppMethodBeat.o(74397);
      return;
    }
  }

  private Bitmap l(aar paramaar)
  {
    boolean bool = true;
    AppMethodBeat.i(74401);
    paramaar = l.a(paramaar, this.mmj);
    if (paramaar != null)
    {
      ab.d("MicroMsg.FavoriteImgDetailUI", "get thumb ok ? %B", new Object[] { Boolean.valueOf(bool) });
      if (paramaar == null)
        break label57;
      AppMethodBeat.o(74401);
    }
    while (true)
    {
      return paramaar;
      bool = false;
      break;
      label57: if (this.mml == null)
        this.mml = com.tencent.mm.compatible.g.a.decodeResource(getResources(), 2131231262);
      paramaar = this.mml;
      AppMethodBeat.o(74401);
    }
  }

  protected final MMLoadScrollView bwd()
  {
    AppMethodBeat.i(74393);
    MMLoadScrollView localMMLoadScrollView = (MMLoadScrollView)findViewById(2131823999);
    AppMethodBeat.o(74393);
    return localMMLoadScrollView;
  }

  public final void d(com.tencent.mm.plugin.fav.a.c paramc)
  {
    AppMethodBeat.i(74402);
    if ((paramc == null) || (!paramc.isFinished()))
      AppMethodBeat.o(74402);
    while (true)
    {
      return;
      ab.d("MicroMsg.FavoriteImgDetailUI", "on cdn status change, dataid[%s]", new Object[] { paramc.field_dataId });
      paramc = (FavoriteImgDetailUI.a)this.mmk.get(paramc.field_dataId);
      if (paramc != null)
        a(paramc);
      AppMethodBeat.o(74402);
    }
  }

  public final int getLayoutId()
  {
    return 2130969537;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(74403);
    if (1 == paramInt1)
      if (-1 != paramInt2)
        AppMethodBeat.o(74403);
    while (true)
    {
      return;
      new k();
      if (k.u(this.mmj))
      {
        h.bQ(this.mController.ylL, getString(2131296320));
        AppMethodBeat.o(74403);
      }
      else
      {
        String str1 = paramIntent.getStringExtra("Select_Conv_User");
        String str2 = paramIntent.getStringExtra("custom_send_text");
        ab.d("MicroMsg.FavoriteImgDetailUI", "select %s for sending", new Object[] { str1 });
        com.tencent.mm.ui.base.p localp = h.b(this.mController.ylL, getString(2131299643), false, null);
        i.a(this.mController.ylL, str1, str2, this.mmj, new FavoriteImgDetailUI.10(this, localp));
        super.onActivityResult(paramInt1, paramInt2, paramIntent);
        AppMethodBeat.o(74403);
      }
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(74398);
    super.onConfigurationChanged(paramConfiguration);
    bwn();
    paramConfiguration = this.mmk.entrySet().iterator();
    while (paramConfiguration.hasNext())
      a((FavoriteImgDetailUI.a)((Map.Entry)paramConfiguration.next()).getValue());
    AppMethodBeat.o(74398);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(74394);
    f.m(this);
    super.onCreate(paramBundle);
    bwn();
    this.mmi = ((LinearLayout)findViewById(2131824000));
    long l = getIntent().getLongExtra("key_detail_info_id", -1L);
    this.mmj = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(l);
    if (this.mmj == null)
    {
      finish();
      AppMethodBeat.o(74394);
    }
    while (true)
    {
      return;
      F(this.mmj);
      Iterator localIterator = this.mmj.field_favProto.wiv.iterator();
      for (int i = 0; localIterator.hasNext(); i++)
      {
        aar localaar = (aar)localIterator.next();
        ab.d("MicroMsg.FavoriteImgDetailUI", "index[%d], dataid[%s]", new Object[] { Integer.valueOf(i), localaar.mnd });
        paramBundle = new FavoriteImgDetailUI.a(this, (byte)0);
        paramBundle.cAv = localaar;
        ImageView localImageView = new ImageView(this.mController.ylL);
        int j = getResources().getDimensionPixelSize(2131427858);
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (i > 0)
          localLayoutParams.topMargin = j;
        this.mmi.addView(localImageView, localLayoutParams);
        localImageView.setTag(localaar);
        j /= 2;
        localImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        localImageView.setPadding(j, j, j, j);
        localImageView.setMinimumWidth(com.tencent.mm.bz.a.fromDPToPix(this.mController.ylL, 50));
        localImageView.setMinimumHeight(com.tencent.mm.bz.a.fromDPToPix(this.mController.ylL, 50));
        localImageView.setImageResource(2131231262);
        localImageView.setOnClickListener(this.mjE);
        localImageView.setOnLongClickListener(this.mlV);
        localImageView.setOnTouchListener(new FavoriteImgDetailUI.9(this));
        paramBundle.cAw = localImageView;
        this.mmk.put(localaar.mnd, paramBundle);
        a(paramBundle);
        if (localaar.whh != 0)
          this.mmm = false;
      }
      setMMTitle(getString(2131299596));
      a.a(this, this.mmj);
      setBackBtn(new FavoriteImgDetailUI.1(this));
      addIconOptionMenu(0, 2131304081, 2131230740, new FavoriteImgDetailUI.3(this, l));
      f.n(this);
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().a(this);
      com.tencent.mm.sdk.b.a.xxA.c(this.mip);
      AppMethodBeat.o(74394);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(74396);
    ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().b(this);
    com.tencent.mm.sdk.b.a.xxA.d(this.mip);
    super.onDestroy();
    AppMethodBeat.o(74396);
  }

  public void onResume()
  {
    AppMethodBeat.i(74395);
    super.onResume();
    Iterator localIterator = this.mmk.entrySet().iterator();
    while (localIterator.hasNext())
      a((FavoriteImgDetailUI.a)((Map.Entry)localIterator.next()).getValue());
    AppMethodBeat.o(74395);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI
 * JD-Core Version:    0.6.2
 */