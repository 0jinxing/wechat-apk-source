package com.tencent.mm.plugin.fav.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.nr;
import com.tencent.mm.g.a.nr.a;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.k;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.plugin.webview.ui.tools.widget.o;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.n;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.ui.tools.j;
import com.tencent.mm.vfs.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@com.tencent.mm.ui.base.a(3)
public class FavImgGalleryUI extends MMActivity
  implements AdapterView.OnItemSelectedListener, com.tencent.mm.plugin.fav.a.p
{
  private boolean cHc;
  private ArrayList<f> iLD;
  private j icA;
  private MMGestureGallery kkn;
  private n.d lcJ;
  private int mik;
  private a mil;
  private Map<String, nr> mim;
  private long mio;
  private com.tencent.mm.sdk.b.c mip;

  public FavImgGalleryUI()
  {
    AppMethodBeat.i(74020);
    this.mik = 0;
    this.cHc = true;
    this.mim = new HashMap();
    this.lcJ = new n.d()
    {
      public final void onMMMenuItemSelected(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        AppMethodBeat.i(74008);
        Object localObject1 = FavImgGalleryUI.e(FavImgGalleryUI.this).vC(FavImgGalleryUI.d(FavImgGalleryUI.this));
        if (localObject1 == null)
          AppMethodBeat.o(74008);
        Object localObject2;
        while (true)
        {
          return;
          localObject2 = b.b(((f)localObject1).cAv);
          if (e.ct((String)localObject2))
            break;
          ab.w("MicroMsg.FavImgGalleryUI", "file not exists");
          AppMethodBeat.o(74008);
        }
        switch (paramAnonymousMenuItem.getItemId())
        {
        default:
        case 0:
        case 1:
        case 2:
        case 3:
        }
        while (true)
        {
          AppMethodBeat.o(74008);
          break;
          com.tencent.mm.plugin.fav.a.h.j(FavImgGalleryUI.f(FavImgGalleryUI.this), 1, 0);
          if (r.amo((String)localObject2))
          {
            paramAnonymousMenuItem = new Intent();
            paramAnonymousMenuItem.putExtra("Select_Conv_Type", 3);
            paramAnonymousMenuItem.putExtra("select_is_ret", true);
            com.tencent.mm.bp.d.b(FavImgGalleryUI.this, ".ui.transmit.SelectConversationUI", paramAnonymousMenuItem, 1);
            AppMethodBeat.o(74008);
            break;
          }
          b.c((String)localObject2, FavImgGalleryUI.this);
          AppMethodBeat.o(74008);
          break;
          b.d((String)localObject2, FavImgGalleryUI.this);
          com.tencent.mm.plugin.fav.a.h.j(FavImgGalleryUI.f(FavImgGalleryUI.this), 0, 0);
          AppMethodBeat.o(74008);
          break;
          FavImgGalleryUI.a((String)localObject2, FavImgGalleryUI.this.getString(2131299726), FavImgGalleryUI.this);
          AppMethodBeat.o(74008);
          break;
          localObject2 = (nr)FavImgGalleryUI.g(FavImgGalleryUI.this).get(localObject2);
          if (localObject2 != null)
          {
            paramAnonymousMenuItem = new cf();
            paramAnonymousMenuItem.cvm.activity = FavImgGalleryUI.this;
            paramAnonymousMenuItem.cvm.ctB = ((nr)localObject2).cJX.result;
            paramAnonymousMenuItem.cvm.cvn = ((nr)localObject2).cJX.cvn;
            paramAnonymousMenuItem.cvm.cvp = 7;
            if ((localObject1 != null) && (((f)localObject1).cAv != null))
            {
              paramAnonymousMenuItem.cvm.imagePath = ((f)localObject1).cAv.wfZ;
              paramAnonymousMenuItem.cvm.cvr = ((f)localObject1).cAv.wgb;
            }
            paramAnonymousMenuItem.cvm.cvo = ((nr)localObject2).cJX.cvo;
            localObject1 = new Bundle(1);
            ((Bundle)localObject1).putInt("stat_scene", 5);
            paramAnonymousMenuItem.cvm.cvs = ((Bundle)localObject1);
            com.tencent.mm.sdk.b.a.xxA.m(paramAnonymousMenuItem);
          }
        }
      }
    };
    this.mip = new FavImgGalleryUI.2(this);
    AppMethodBeat.o(74020);
  }

  private void Km()
  {
    AppMethodBeat.i(74023);
    this.mio = getIntent().getLongExtra("key_detail_info_id", -1L);
    String str = getIntent().getStringExtra("key_detail_data_id");
    boolean bool1 = getIntent().getBooleanExtra("fav_open_from_wnnote", false);
    Object localObject1 = getIntent().getStringExtra("fav_note_xml");
    ArrayList localArrayList = new ArrayList();
    Object localObject2 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(this.mio);
    long l = this.mio;
    boolean bool2;
    if (localObject2 != null)
    {
      bool2 = true;
      ab.i("MicroMsg.FavImgGalleryUI", "show one fav info, local id is %d, get from db ok ? %B", new Object[] { Long.valueOf(l), Boolean.valueOf(bool2) });
      if ((!bool1) || (bo.isNullOrNil((String)localObject1)))
        break label440;
      localObject2 = b.LF((String)localObject1);
    }
    label180: label437: label440: 
    while (true)
    {
      if (localObject2 != null)
        localArrayList.add(localObject2);
      this.iLD.clear();
      int i = -1;
      int j = localArrayList.size();
      int k = 0;
      com.tencent.mm.plugin.fav.a.g localg;
      int n;
      if (k < j)
      {
        localg = (com.tencent.mm.plugin.fav.a.g)localArrayList.get(k);
        int m = localg.field_favProto.wiv.size();
        n = 0;
        label217: if (n < m)
        {
          localObject2 = (aar)localg.field_favProto.wiv.get(n);
          if (((((aar)localObject2).dataType == 8) && (!r.amo(b.b((aar)localObject2)))) || ((((aar)localObject2).dataType != 2) && (((aar)localObject2).dataType != 8)))
            break label437;
          localObject1 = new f(localg, (aar)localObject2);
          this.iLD.add(localObject1);
          if ((str == null) || (!str.equals(((aar)localObject2).mnd)))
            break label437;
          i = this.iLD.size() - 1;
        }
      }
      while (true)
      {
        n++;
        break label217;
        bool2 = false;
        break;
        n = i;
        if (str == null)
        {
          n = i;
          if (localg.field_localId == this.mio)
            n = this.iLD.size() - 1;
        }
        k++;
        i = n;
        break label180;
        getIntent().removeExtra("key_detail_info_id");
        getIntent().removeExtra("key_detail_data_id");
        this.mil.notifyDataSetChanged();
        this.kkn.post(new FavImgGalleryUI.8(this, i));
        AppMethodBeat.o(74023);
        return;
      }
    }
  }

  public static void a(String paramString1, String paramString2, Context paramContext)
  {
    AppMethodBeat.i(74022);
    if (bo.isNullOrNil(paramString1))
    {
      ab.w("MicroMsg.FavImgGalleryUI", "save image fail, path is null");
      AppMethodBeat.o(74022);
    }
    while (true)
    {
      return;
      if (!com.tencent.mm.platformtools.q.a(paramString1, paramContext, 2131298807))
        Toast.makeText(paramContext, paramString2, 1).show();
      AppMethodBeat.o(74022);
    }
  }

  public final void d(com.tencent.mm.plugin.fav.a.c paramc)
  {
    AppMethodBeat.i(74028);
    if (paramc != null)
    {
      ab.v("MicroMsg.FavImgGalleryUI", "on cdn status changed, status:%d", new Object[] { Integer.valueOf(paramc.field_status) });
      f localf = this.mil.vC(this.mik);
      if ((localf != null) && (bo.bc(paramc.field_dataId, "").equals(localf.cAv.mnd)))
        al.d(new FavImgGalleryUI.9(this, paramc));
    }
    AppMethodBeat.o(74028);
  }

  public final int getLayoutId()
  {
    return 2130969504;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(74029);
    if (1 == paramInt1)
      if (-1 != paramInt2)
        AppMethodBeat.o(74029);
    while (true)
    {
      return;
      f localf = this.mil.vC(this.mik);
      if (localf == null)
      {
        ab.i("MicroMsg.FavImgGalleryUI", "dataItem is null.");
        AppMethodBeat.o(74029);
      }
      else
      {
        new k();
        if (k.u(localf.mij))
        {
          com.tencent.mm.ui.base.h.bQ(this.mController.ylL, getString(2131296320));
          AppMethodBeat.o(74029);
        }
        else
        {
          String str = paramIntent.getStringExtra("Select_Conv_User");
          ab.d("MicroMsg.FavImgGalleryUI", "select %s for sending", new Object[] { str });
          com.tencent.mm.ui.base.p localp = com.tencent.mm.ui.base.h.b(this.mController.ylL, getString(2131299643), false, null);
          i.a(this.mController.ylL, str, localf.mij, localf.cAv, new FavImgGalleryUI.10(this, localp));
          super.onActivityResult(paramInt1, paramInt2, paramIntent);
          AppMethodBeat.o(74029);
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(74021);
    super.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 21)
    {
      getWindow().setFlags(1024, 1024);
      getWindow().addFlags(67108864);
    }
    this.cHc = getIntent().getBooleanExtra("show_share", true);
    this.kkn = ((MMGestureGallery)findViewById(2131822081));
    this.kkn.setVerticalFadingEdgeEnabled(false);
    this.kkn.setHorizontalFadingEdgeEnabled(false);
    this.kkn.setOnItemSelectedListener(this);
    this.kkn.setSingleClickOverListener(new FavImgGalleryUI.1(this));
    if (this.cHc)
      this.kkn.setLongClickOverListener(new FavImgGalleryUI.3(this));
    fullScreenNoTitleBar(true);
    this.iLD = new ArrayList();
    this.mil = new a((byte)0);
    this.kkn.setAdapter(this.mil);
    Km();
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(74005);
        FavImgGalleryUI.this.finish();
        AppMethodBeat.o(74005);
        return true;
      }
    });
    com.tencent.mm.sdk.b.a.xxA.c(this.mip);
    setResult(0, getIntent());
    AppMethodBeat.o(74021);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(74024);
    getIntent().putExtra("key_activity_browse_time", dyi());
    com.tencent.mm.sdk.b.a.xxA.d(this.mip);
    super.onDestroy();
    AppMethodBeat.o(74024);
  }

  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(74027);
    this.mik = paramInt;
    ab.d("MicroMsg.FavImgGalleryUI", "pos:".concat(String.valueOf(paramInt)));
    if ((paramView instanceof MultiTouchImageView))
      ((MultiTouchImageView)paramView).dzA();
    AppMethodBeat.o(74027);
  }

  public void onNothingSelected(AdapterView<?> paramAdapterView)
  {
  }

  public void onPause()
  {
    AppMethodBeat.i(74026);
    super.onPause();
    ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().b(this);
    o.JV(2);
    AppMethodBeat.o(74026);
  }

  public void onResume()
  {
    AppMethodBeat.i(74025);
    super.onResume();
    ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().a(this);
    o.JV(1);
    AppMethodBeat.o(74025);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class a extends BaseAdapter
  {
    SparseBooleanArray mit;

    private a()
    {
      AppMethodBeat.i(74012);
      this.mit = new SparseBooleanArray();
      AppMethodBeat.o(74012);
    }

    private Bitmap a(f paramf)
    {
      AppMethodBeat.i(74017);
      if (paramf != null)
      {
        paramf = l.a(paramf.cAv, paramf.mij);
        if (paramf != null)
          AppMethodBeat.o(74017);
      }
      while (true)
      {
        return paramf;
        paramf = com.tencent.mm.compatible.g.a.decodeResource(FavImgGalleryUI.this.getResources(), 2131231218);
        AppMethodBeat.o(74017);
      }
    }

    private void a(FavImgGalleryUI.b paramb, Bitmap paramBitmap, String paramString)
    {
      AppMethodBeat.i(74016);
      paramb.progressBar.setVisibility(8);
      paramb.mix.setVisibility(8);
      paramb.miw.setVisibility(8);
      paramb.miu.setVisibility(0);
      paramb.miy.setVisibility(8);
      b(paramb, paramBitmap, paramString);
      AppMethodBeat.o(74016);
    }

    private void b(FavImgGalleryUI.b paramb, Bitmap paramBitmap, String paramString)
    {
      AppMethodBeat.i(74018);
      n.w(paramb.miv, paramBitmap.getWidth(), paramBitmap.getHeight());
      int i = paramb.miv.getWidth();
      int j = paramb.miv.getHeight();
      Object localObject = new Matrix();
      ((Matrix)localObject).reset();
      float f1 = paramBitmap.getWidth() / paramBitmap.getHeight();
      float f2 = paramBitmap.getHeight() / paramBitmap.getWidth();
      ab.v("MicroMsg.FavImgGalleryUI", "whDiv is " + f1 + " hwDiv is " + f2);
      if ((f2 >= 2.0F) && (paramBitmap.getHeight() >= 480))
      {
        f1 = paramBitmap.getWidth() / i;
        f2 = i / paramBitmap.getWidth();
        if (f1 > 1.0D)
        {
          ((Matrix)localObject).postScale(f2, f2);
          paramBitmap.getHeight();
          ((Matrix)localObject).postTranslate((i - f2 * paramBitmap.getWidth()) / 2.0F, 0.0F);
        }
      }
      while (true)
      {
        paramb.miv.setImageMatrix((Matrix)localObject);
        paramb.miv.bW(paramBitmap.getWidth(), paramBitmap.getHeight());
        paramb.miv.setMaxZoomDoubleTab(true);
        if (!bo.isNullOrNil(paramString))
          break label524;
        paramb.miv.setImageBitmap(paramBitmap);
        AppMethodBeat.o(74018);
        label245: return;
        ((Matrix)localObject).postScale(1.0F, 1.0F);
        ((Matrix)localObject).postTranslate((i - paramBitmap.getWidth()) / 2, 0.0F);
        continue;
        if ((f1 < 2.0F) || (paramBitmap.getWidth() < 480))
          break;
        f1 = paramBitmap.getHeight() / 480.0F;
        f2 = 480.0F / paramBitmap.getHeight();
        if (f1 > 1.0D)
        {
          ((Matrix)localObject).postScale(f1, f2);
          ((Matrix)localObject).postTranslate(0.0F, (j - 480) / 2);
        }
        else
        {
          ((Matrix)localObject).postScale(1.0F, 1.0F);
          f2 = (j - paramBitmap.getHeight()) / 2;
          ab.d("MicroMsg.FavImgGalleryUI", " offsety ".concat(String.valueOf(f2)));
          ((Matrix)localObject).postTranslate(0.0F, f2);
        }
      }
      f1 = i / paramBitmap.getWidth();
      f2 = j / paramBitmap.getHeight();
      if (f1 < f2)
      {
        f2 = f1;
        label429: float f3 = paramBitmap.getWidth() / i;
        f1 = paramBitmap.getHeight() / j;
        if (f3 <= f1)
          break label521;
        f1 = f3;
        label463: if (f1 <= 1.0D)
          break label642;
        ((Matrix)localObject).postScale(f2, f2);
      }
      while (true)
      {
        while (true)
        {
          ((Matrix)localObject).postTranslate((i - paramBitmap.getWidth() * f2) / 2.0F, (j - f2 * paramBitmap.getHeight()) / 2.0F);
          break;
          break label429;
          label521: break label463;
          try
          {
            label524: localObject = new com/tencent/mm/plugin/gif/d;
            ((com.tencent.mm.plugin.gif.d)localObject).<init>(paramString);
            paramb.miv.setGifDrawable((Drawable)localObject);
            paramb.miv.hk(com.tencent.mm.bz.a.gd(FavImgGalleryUI.this.mController.ylL), com.tencent.mm.bz.a.ge(FavImgGalleryUI.this.mController.ylL));
            paramb.miv.bW(((com.tencent.mm.plugin.gif.d)localObject).getIntrinsicWidth(), ((com.tencent.mm.plugin.gif.d)localObject).getIntrinsicHeight());
            paramb.miv.start();
            paramb.miv.dAp();
            AppMethodBeat.o(74018);
          }
          catch (Exception paramString)
          {
            ab.e("MicroMsg.FavImgGalleryUI", bo.l(paramString));
            paramb.miv.setImageBitmap(paramBitmap);
            AppMethodBeat.o(74018);
          }
        }
        break label245;
        label642: f2 = 1.0F;
      }
    }

    public final int getCount()
    {
      AppMethodBeat.i(74013);
      int i = FavImgGalleryUI.h(FavImgGalleryUI.this).size();
      AppMethodBeat.o(74013);
      return i;
    }

    public final long getItemId(int paramInt)
    {
      return paramInt;
    }

    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      AppMethodBeat.i(74015);
      f localf;
      Object localObject;
      if (paramView == null)
      {
        paramViewGroup = new FavImgGalleryUI.b(FavImgGalleryUI.this, (byte)0);
        paramView = View.inflate(FavImgGalleryUI.this.mController.ylL, 2130969503, null);
        paramViewGroup.miu = paramView.findViewById(2131820630);
        paramViewGroup.miv = ((MultiTouchImageView)paramView.findViewById(2131820629));
        paramViewGroup.progressBar = ((ProgressBar)paramView.findViewById(2131822617));
        paramViewGroup.miw = ((ImageView)paramView.findViewById(2131821511));
        paramViewGroup.mix = ((TextView)paramView.findViewById(2131823911));
        paramViewGroup.miy = ((LinearLayout)paramView.findViewById(2131823884));
        paramViewGroup.miz = ((TextView)paramView.findViewById(2131823885));
        paramViewGroup.miz.setText(2131299600);
        paramView.setTag(paramViewGroup);
        paramView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
        localf = vC(paramInt);
        boolean bool = this.mit.get(paramInt, true);
        this.mit.put(paramInt, false);
        localObject = l.a(localf.cAv, localf.mij, bool);
        if (localf.mij != null)
          ab.i("MicroMsg.FavImgGalleryUI", "index %d item favid %d, localid %d, itemStatus %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(localf.mij.field_id), Long.valueOf(localf.mij.field_localId), Integer.valueOf(localf.mij.field_itemStatus) });
        if (localf.cAv != null)
          ab.i("MicroMsg.FavImgGalleryUI", "item dataId %s, item data url %s, key %s, fullsize %d, thumb url %s, key %s, thumb size %d", new Object[] { localf.cAv.mnd, localf.cAv.wfZ, localf.cAv.wgb, Long.valueOf(localf.cAv.wgu), localf.cAv.fgE, localf.cAv.wfV, Long.valueOf(localf.cAv.wgF) });
        if (localObject != null)
          break label798;
        FavImgGalleryUI.this.enableOptionMenu(false);
        ab.w("MicroMsg.FavImgGalleryUI", "get big image fail");
        com.tencent.mm.plugin.fav.a.q localq = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage();
        if (localf.cAv == null)
          break label564;
        localObject = localf.cAv.mnd;
        label437: localObject = localq.LR((String)localObject);
        if (localObject != null)
          break label643;
        paramViewGroup.miy.setVisibility(8);
        if ((localf.mij == null) || (localf.mij.field_id >= 0))
          break label572;
        paramViewGroup.progressBar.setVisibility(0);
        paramViewGroup.mix.setVisibility(0);
        paramViewGroup.miw.setVisibility(0);
        paramViewGroup.miu.setVisibility(8);
        paramViewGroup.miw.setImageBitmap(a(localf));
        paramViewGroup.progressBar.setProgress(0);
        paramViewGroup.mix.setText("0%");
      }
      while (true)
      {
        AppMethodBeat.o(74015);
        return paramView;
        paramViewGroup = (FavImgGalleryUI.b)paramView.getTag();
        break;
        label564: localObject = "";
        break label437;
        label572: paramViewGroup.progressBar.setVisibility(8);
        paramViewGroup.mix.setVisibility(8);
        paramViewGroup.miw.setVisibility(8);
        paramViewGroup.miu.setVisibility(0);
        if (localf.cAv.whh != 0)
          paramViewGroup.miy.setVisibility(0);
        b(paramViewGroup, a(localf), "");
      }
      label643: ab.i("MicroMsg.FavImgGalleryUI", "fav cdnInfo status %d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.fav.a.c)localObject).field_status) });
      paramViewGroup.progressBar.setVisibility(0);
      paramViewGroup.mix.setVisibility(0);
      paramViewGroup.miw.setVisibility(0);
      paramViewGroup.miu.setVisibility(8);
      paramViewGroup.miw.setImageBitmap(a(localf));
      if (((com.tencent.mm.plugin.fav.a.c)localObject).field_totalLen > 0);
      for (paramInt = ((com.tencent.mm.plugin.fav.a.c)localObject).field_offset * 100 / ((com.tencent.mm.plugin.fav.a.c)localObject).field_totalLen - 1; ; paramInt = 0)
      {
        int i = paramInt;
        if (paramInt < 0)
          i = 0;
        paramViewGroup.progressBar.setProgress(i);
        paramViewGroup.mix.setText(i + "%");
        AppMethodBeat.o(74015);
        break;
      }
      label798: FavImgGalleryUI.this.enableOptionMenu(true);
      if (r.amo(b.b(localf.cAv)))
        a(paramViewGroup, (Bitmap)localObject, b.b(localf.cAv));
      while (true)
      {
        AppMethodBeat.o(74015);
        break;
        a(paramViewGroup, (Bitmap)localObject, "");
      }
    }

    public final f vC(int paramInt)
    {
      AppMethodBeat.i(74014);
      f localf;
      if (paramInt >= FavImgGalleryUI.h(FavImgGalleryUI.this).size())
      {
        ab.w("MicroMsg.FavImgGalleryUI", "get item fail, position %d error", new Object[] { Integer.valueOf(paramInt) });
        localf = null;
        AppMethodBeat.o(74014);
      }
      while (true)
      {
        return localf;
        localf = (f)FavImgGalleryUI.h(FavImgGalleryUI.this).get(paramInt);
        AppMethodBeat.o(74014);
      }
    }
  }

  final class b
  {
    View miu;
    MultiTouchImageView miv;
    ImageView miw;
    TextView mix;
    LinearLayout miy;
    TextView miz;
    ProgressBar progressBar;

    private b()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavImgGalleryUI
 * JD-Core Version:    0.6.2
 */