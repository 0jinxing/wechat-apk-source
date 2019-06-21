package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.s;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.downloader.model.e.a;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.model.j;
import com.tencent.mm.plugin.game.model.j.a;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class GameInstalledView extends LinearLayout
  implements View.OnClickListener
{
  private static int njA;
  private static int njB;
  private static Map<String, Integer> njy;
  private int count;
  private Context mContext;
  private int mXC;
  private LinkedList<f> mYj;
  private j.a ngQ;
  private int njC;
  private int njD;
  private int njE;
  private GameInstalledView.a njF;
  private LinkedList<com.tencent.mm.plugin.game.model.c> njG;
  LinearLayout.LayoutParams njH;
  private LinearLayout nju;
  private ImageView njv;
  private TextView njw;
  private TextView njx;
  private final DisplayMetrics njz;

  static
  {
    AppMethodBeat.i(112005);
    njy = new HashMap();
    njA = 6;
    njB = 7;
    AppMethodBeat.o(112005);
  }

  public GameInstalledView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(111999);
    this.mYj = new LinkedList();
    this.njz = new DisplayMetrics();
    this.njC = 4;
    this.count = 0;
    this.mXC = 0;
    this.njD = 1;
    this.njE = 999;
    this.njH = new LinearLayout.LayoutParams(-1, -2);
    this.ngQ = new GameInstalledView.2(this);
    this.mContext = paramContext;
    AppMethodBeat.o(111999);
  }

  private void bFp()
  {
    AppMethodBeat.i(112002);
    if (bo.ek(this.mYj))
    {
      setVisibility(8);
      AppMethodBeat.o(112002);
    }
    while (true)
    {
      return;
      setVisibility(0);
      this.nju.removeAllViews();
      this.count = 0;
      Object localObject1 = (LayoutInflater)getContext().getSystemService("layout_inflater");
      int i;
      int j;
      int k;
      Object localObject2;
      label275: Object localObject3;
      Object localObject4;
      Object localObject5;
      if (this.mYj.size() >= this.njC - 1)
      {
        njB = 7;
        njA = 6;
        i = BackwardSupportUtil.b.b(this.mContext, (njA << 1) + 84);
        ((WindowManager)this.mContext.getSystemService("window")).getDefaultDisplay().getMetrics(this.njz);
        j = (int)(this.njz.widthPixels * 160 / this.njz.densityDpi);
        this.njC = ((this.njz.widthPixels - 1) / i + 1);
        if (this.njC == 3)
          njB = 3;
        k = (njA << 1) + 84;
        i = njA + 6 + njB;
        j = (j - 16) % k;
        if (j < i)
        {
          njA -= 2;
          BackwardSupportUtil.b.b(this.mContext, (njA << 1) + 84);
        }
      }
      else
      {
        this.njH.setMargins(BackwardSupportUtil.b.b(this.mContext, njA), 0, BackwardSupportUtil.b.b(this.mContext, njA), 0);
        localObject2 = this.mYj.iterator();
        if (!((Iterator)localObject2).hasNext())
          break label702;
        localObject3 = (f)((Iterator)localObject2).next();
        localObject4 = ((LayoutInflater)localObject1).inflate(2130969867, null);
        this.njv = ((ImageView)((View)localObject4).findViewById(2131821535));
        this.njw = ((TextView)((View)localObject4).findViewById(2131821537));
        this.njx = ((TextView)((View)localObject4).findViewById(2131825016));
        localObject5 = g.b(((f)localObject3).field_appId, 1, com.tencent.mm.bz.a.getDensity(this.mContext));
        if (localObject5 == null)
          break label584;
        this.njv.setImageBitmap((Bitmap)localObject5);
        label380: this.njw.setText(g.b(this.mContext, (f)localObject3, null));
        if (!g.a(this.mContext, (f)localObject3))
          break label669;
        i = com.tencent.mm.plugin.game.f.c.Or(((f)localObject3).field_packageName);
        if ((!njy.containsKey(((f)localObject3).field_appId)) || (((Integer)njy.get(((f)localObject3).field_appId)).intValue() <= i))
          break label610;
        localObject5 = d.bij().Ir(((f)localObject3).field_appId);
        this.njx.setTextColor(this.mContext.getResources().getColor(2131690107));
        if (((FileDownloadTaskInfo)localObject5).status != 1)
          break label597;
        this.njx.setText(2131300224);
      }
      label669: 
      while (true)
      {
        ((View)localObject4).setTag(localObject3);
        ((View)localObject4).setOnClickListener(this);
        this.nju.addView((View)localObject4, this.njH);
        break label275;
        if (j <= k - i)
          break;
        njA = (j - (k >> 1)) / this.njC + njA;
        BackwardSupportUtil.b.b(this.mContext, (njA << 1) + 84);
        break;
        label584: this.njv.setImageResource(2130837795);
        break label380;
        label597: this.njx.setText(2131300223);
        continue;
        label610: if (!bo.isNullOrNil(((s)localObject3).dne))
        {
          this.njx.setText(((s)localObject3).dne);
          this.njx.setTextColor(this.mContext.getResources().getColor(2131690124));
        }
        else
        {
          this.njx.setText("");
          continue;
          this.njx.setTextColor(this.mContext.getResources().getColor(2131690107));
          this.njx.setText(2131300288);
        }
      }
      label702: if ((this.njF != null) && (this.njF.iconUrl != null) && (this.njF.title != null))
      {
        localObject2 = ((LayoutInflater)localObject1).inflate(2130969867, null);
        this.njv = ((ImageView)((View)localObject2).findViewById(2131821535));
        this.njw = ((TextView)((View)localObject2).findViewById(2131821537));
        this.njx = ((TextView)((View)localObject2).findViewById(2131825016));
        localObject3 = o.ahp();
        localObject4 = this.njF.iconUrl;
        localObject5 = this.njv;
        localObject1 = new c.a();
        ((c.a)localObject1).ePG = true;
        ((com.tencent.mm.at.a.a)localObject3).a((String)localObject4, (ImageView)localObject5, ((c.a)localObject1).ahG(), new GameInstalledView.1(this, (View)localObject2));
        this.njw.setText(this.njF.title);
        this.njx.setVisibility(8);
        ((View)localObject2).setTag(this.njF);
        ((View)localObject2).setOnClickListener(this);
      }
      AppMethodBeat.o(112002);
    }
  }

  public final void gO(boolean paramBoolean)
  {
    AppMethodBeat.i(112001);
    if (bo.ek(this.njG))
    {
      setVisibility(8);
      AppMethodBeat.o(112001);
    }
    while (true)
    {
      return;
      setVisibility(0);
      Object localObject1;
      Object localObject2;
      if (paramBoolean)
      {
        this.mYj = com.tencent.mm.plugin.game.model.e.bDQ();
        if ((!bo.ek(this.njG)) && (!bo.ek(this.mYj)))
        {
          localObject1 = this.njG.iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (com.tencent.mm.plugin.game.model.c)((Iterator)localObject1).next();
            if (this.mYj.contains(localObject2))
            {
              this.mYj.remove(localObject2);
              this.mYj.addFirst(localObject2);
            }
          }
        }
      }
      else
      {
        localObject1 = new LinkedList();
        ((LinkedList)localObject1).addAll(this.mYj);
        Object localObject3 = new LinkedList();
        ((LinkedList)localObject3).addAll(com.tencent.mm.plugin.game.model.e.bDQ());
        localObject2 = new LinkedList();
        Object localObject4 = ((LinkedList)localObject1).iterator();
        while (((Iterator)localObject4).hasNext())
        {
          localObject5 = (f)((Iterator)localObject4).next();
          if ((!((LinkedList)localObject3).contains(localObject5)) && (!((LinkedList)localObject2).contains(localObject5)))
            ((LinkedList)localObject2).add(localObject5);
        }
        Object localObject5 = ((LinkedList)localObject1).iterator();
        while (((Iterator)localObject5).hasNext())
        {
          localObject4 = (f)((Iterator)localObject5).next();
          if (((LinkedList)localObject3).contains(localObject4))
            ((LinkedList)localObject3).remove(localObject4);
          else if (!g.a(this.mContext, (f)localObject4))
            ((LinkedList)localObject2).add(localObject4);
        }
        if (((LinkedList)localObject3).size() > 0)
        {
          localObject4 = ((LinkedList)localObject3).iterator();
          while (((Iterator)localObject4).hasNext())
          {
            localObject3 = (f)((Iterator)localObject4).next();
            if (!((LinkedList)localObject1).contains(localObject3))
              ((LinkedList)localObject1).addFirst(localObject3);
          }
        }
        if (((LinkedList)localObject2).size() > 0)
          ((LinkedList)localObject1).removeAll((Collection)localObject2);
        localObject2 = new LinkedList();
        localObject1 = ((LinkedList)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
          ((LinkedList)localObject2).add(g.bT(((f)((Iterator)localObject1).next()).field_appId, true));
        this.mYj = ((LinkedList)localObject2);
      }
      bFp();
      AppMethodBeat.o(112001);
    }
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(112004);
    if (paramView.getTag() == null)
      AppMethodBeat.o(112004);
    int i;
    Object localObject;
    while (true)
    {
      return;
      if (!(paramView.getTag() instanceof f))
        break;
      paramView = (f)paramView.getTag();
      if ((paramView == null) || (bo.isNullOrNil(paramView.field_appId)))
      {
        ab.e("MicroMsg.GameInstalledView", "appinfo is null or appid is null");
        AppMethodBeat.o(112004);
      }
      else
      {
        if (g.a(this.mContext, paramView))
        {
          i = com.tencent.mm.plugin.game.f.c.Or(paramView.field_packageName);
          if ((njy.containsKey(paramView.field_appId)) && (((Integer)njy.get(paramView.field_appId)).intValue() > i))
          {
            localObject = d.bij().Ir(paramView.field_appId);
            if (((FileDownloadTaskInfo)localObject).status == 1)
              d.bij().hl(((FileDownloadTaskInfo)localObject).id);
          }
          while (true)
          {
            gO(false);
            AppMethodBeat.o(112004);
            break;
            if (((FileDownloadTaskInfo)localObject).status == 3)
            {
              if ((com.tencent.mm.vfs.e.ct(((FileDownloadTaskInfo)localObject).path)) && (com.tencent.mm.plugin.game.f.c.Os(((FileDownloadTaskInfo)localObject).path) > i))
              {
                paramView = Uri.fromFile(new File(((FileDownloadTaskInfo)localObject).path));
                q.a(this.mContext, paramView, null);
              }
              else
              {
                d.bij().hl(((FileDownloadTaskInfo)localObject).id);
              }
            }
            else
            {
              j.n(paramView.dna, paramView.dnf, paramView.field_appId, "");
              localObject = new e.a();
              ((e.a)localObject).It(paramView.dna);
              ((e.a)localObject).Iv(g.b(this.mContext, paramView, null));
              ((e.a)localObject).setAppId(paramView.field_appId);
              ((e.a)localObject).Iw(paramView.dnf);
              ((e.a)localObject).ga(true);
              ((e.a)localObject).tN(1);
              d.bij().a(((e.a)localObject).kNl);
              continue;
              com.tencent.mm.plugin.game.model.e.ak(this.mContext, paramView.field_appId);
              b.a(this.mContext, 10, 1002, this.njD, 3, 0, paramView.field_appId, this.mXC, 0, null, null, null);
              this.mYj.remove(paramView);
              this.mYj.addFirst(paramView);
            }
          }
        }
        localObject = d.bij().Ir(paramView.field_appId);
        if ((localObject != null) && (((FileDownloadTaskInfo)localObject).status == 3))
        {
          if ((!bo.isNullOrNil(((FileDownloadTaskInfo)localObject).path)) && (com.tencent.mm.vfs.e.ct(((FileDownloadTaskInfo)localObject).path)))
          {
            paramView = Uri.fromFile(new File(((FileDownloadTaskInfo)localObject).path));
            q.a(this.mContext, paramView, null);
            AppMethodBeat.o(112004);
          }
          else
          {
            ab.e("MicroMsg.GameInstalledView", "file status is success, while the download file not exsit:[%s]", new Object[] { ((FileDownloadTaskInfo)localObject).path });
            d.bij().hl(((FileDownloadTaskInfo)localObject).id);
            gO(false);
            AppMethodBeat.o(112004);
          }
        }
        else
        {
          ab.i("MicroMsg.GameInstalledView", "app not installed or download sucess : [%s]", new Object[] { paramView.field_appName });
          gO(false);
          AppMethodBeat.o(112004);
        }
      }
    }
    if ((paramView.getTag() instanceof GameInstalledView.a))
    {
      paramView = (GameInstalledView.a)paramView.getTag();
      localObject = new Intent();
      i = 6;
      if (!bo.isNullOrNil(paramView.hAh))
        break label646;
      ((Intent)localObject).setClass(this.mContext, GameLibraryUI.class);
      ((Intent)localObject).putExtra("game_report_from_scene", 1002);
      this.mContext.startActivity((Intent)localObject);
    }
    while (true)
    {
      b.a(this.mContext, 10, 1002, this.njE, i, 0, null, this.mXC, 0, null, null, null);
      AppMethodBeat.o(112004);
      break;
      label646: i = com.tencent.mm.plugin.game.f.c.t(this.mContext, paramView.hAh, "game_center_installed_more");
    }
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(112000);
    super.onFinishInflate();
    this.nju = ((LinearLayout)findViewById(2131824397));
    j.a(this.ngQ);
    AppMethodBeat.o(112000);
  }

  public void setInstalledGameInfo(LinkedList<com.tencent.mm.plugin.game.model.c> paramLinkedList)
  {
    this.njG = paramLinkedList;
  }

  public void setMoreGameInfo(GameInstalledView.a parama)
  {
    this.njF = parama;
  }

  public void setSourceScene(int paramInt)
  {
    this.mXC = paramInt;
  }

  public void setVersionCodes(Map<String, Integer> paramMap)
  {
    AppMethodBeat.i(112003);
    if ((paramMap == null) || (paramMap.isEmpty()))
      AppMethodBeat.o(112003);
    while (true)
    {
      return;
      njy = paramMap;
      AppMethodBeat.o(112003);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameInstalledView
 * JD-Core Version:    0.6.2
 */