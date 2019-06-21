package com.tencent.mm.plugin.fav.ui.gallery;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.nr;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.k;
import com.tencent.mm.plugin.fav.a.p;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.plugin.fav.ui.f;
import com.tencent.mm.plugin.fav.ui.i;
import com.tencent.mm.plugin.fav.ui.widget.FavVideoView;
import com.tencent.mm.plugin.webview.ui.tools.widget.o;
import com.tencent.mm.pluginsdk.ui.tools.e;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.ui.tools.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@com.tencent.mm.ui.base.a(3)
public class FavMediaGalleryUI extends MMActivity
  implements AdapterView.OnItemSelectedListener, p
{
  private boolean cHc;
  private ArrayList<f> iLD;
  private j icA;
  private MMGestureGallery kkn;
  private n.d lcJ;
  private int mik;
  private Map<String, nr> mim;
  private long mio;
  private com.tencent.mm.sdk.b.c mip;
  private int mnC;
  private FavVideoView mnD;
  private FavMediaGalleryUI.a mnE;
  private List<FavVideoView> mnF;
  abh mnG;

  public FavMediaGalleryUI()
  {
    AppMethodBeat.i(74528);
    this.mik = 0;
    this.mnC = -1;
    this.mnD = null;
    this.cHc = true;
    this.mnF = new ArrayList();
    this.mnG = new abh();
    this.mim = new HashMap();
    this.lcJ = new FavMediaGalleryUI.8(this);
    this.mip = new FavMediaGalleryUI.3(this);
    AppMethodBeat.o(74528);
  }

  private void Km()
  {
    AppMethodBeat.i(74530);
    Object localObject1 = getIntent().getLongArrayExtra("KEY_MEDIA_FAVID_LIST");
    ArrayList localArrayList = new ArrayList();
    String str = getIntent().getStringExtra("key_detail_data_id");
    this.mio = getIntent().getLongExtra("key_detail_info_id", -1L);
    Object localObject2;
    long l;
    boolean bool2;
    if (localObject1 == null)
    {
      boolean bool1 = getIntent().getBooleanExtra("fav_open_from_wnnote", false);
      localObject2 = getIntent().getStringExtra("fav_note_xml");
      localObject1 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(this.mio);
      l = this.mio;
      if (localObject1 != null)
      {
        bool2 = true;
        ab.i("MicroMsg.FavMediaGalleryUI", "show one fav info, local id is %d, get from db ok ? %B", new Object[] { Long.valueOf(l), Boolean.valueOf(bool2) });
        if ((!bool1) || (bo.isNullOrNil((String)localObject2)))
          break label551;
        localObject1 = b.LF((String)localObject2);
      }
    }
    label548: label551: 
    while (true)
    {
      if (localObject1 != null)
        localArrayList.add(localObject1);
      label170: this.iLD.clear();
      int i = -1;
      int j = localArrayList.size();
      int k = 0;
      label191: int n;
      if (k < j)
      {
        localObject1 = (com.tencent.mm.plugin.fav.a.g)localArrayList.get(k);
        int m = ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.wiv.size();
        n = 0;
        label225: if (n < m)
        {
          localObject2 = (aar)((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.wiv.get(n);
          if (((((aar)localObject2).dataType == 8) && (!r.amo(b.b((aar)localObject2)))) || ((((aar)localObject2).dataType != 2) && (((aar)localObject2).dataType != 4) && (((aar)localObject2).dataType != 15) && (((aar)localObject2).dataType != 8)))
            break label548;
          f localf = new f((com.tencent.mm.plugin.fav.a.g)localObject1, (aar)localObject2);
          this.iLD.add(localf);
          if ((str == null) || (!str.equals(((aar)localObject2).mnd)) || (((com.tencent.mm.plugin.fav.a.g)localObject1).field_localId != this.mio))
            break label548;
          i = this.iLD.size() - 1;
        }
      }
      while (true)
      {
        n++;
        break label225;
        bool2 = false;
        break;
        n = localObject1.length;
        for (i = 0; i < n; i++)
        {
          l = localObject1[i];
          localObject2 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(l);
          if ((localObject2 != null) && (!localArrayList.contains(localObject2)))
            localArrayList.add(localObject2);
        }
        break label170;
        n = i;
        if (str == null)
        {
          n = i;
          if (((com.tencent.mm.plugin.fav.a.g)localObject1).field_localId == this.mio)
            n = this.iLD.size() - 1;
        }
        k++;
        i = n;
        break label191;
        getIntent().removeExtra("key_detail_info_id");
        getIntent().removeExtra("key_detail_data_id");
        this.mnE.notifyDataSetChanged();
        this.kkn.post(new FavMediaGalleryUI.9(this, i));
        AppMethodBeat.o(74530);
        return;
      }
    }
  }

  public final void d(com.tencent.mm.plugin.fav.a.c paramc)
  {
    AppMethodBeat.i(74535);
    if (paramc != null)
    {
      f localf = this.mnE.vC(this.mik);
      if ((localf != null) && (bo.bc(paramc.field_dataId, "").equals(localf.cAv.mnd)) && (localf.cAv.dataType == 2))
        al.d(new FavMediaGalleryUI.10(this, paramc));
    }
    AppMethodBeat.o(74535);
  }

  public final int getLayoutId()
  {
    return 2130969504;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(74536);
    if (1 == paramInt1)
      if (-1 != paramInt2)
        AppMethodBeat.o(74536);
    while (true)
    {
      return;
      f localf = this.mnE.vC(this.mik);
      if (localf == null)
      {
        ab.i("MicroMsg.FavMediaGalleryUI", "dataItem is null.");
        AppMethodBeat.o(74536);
      }
      else
      {
        String str = b.b(localf.cAv);
        new k();
        if (k.u(localf.mij))
        {
          h.bQ(this.mController.ylL, getString(2131296320));
          AppMethodBeat.o(74536);
        }
        else
        {
          Object localObject1 = paramIntent.getStringExtra("Select_Conv_User");
          Object localObject2 = bo.P(((String)localObject1).split(","));
          ab.d("MicroMsg.FavMediaGalleryUI", "select %s for sending", new Object[] { localObject1 });
          localObject1 = h.b(this.mController.ylL, getString(2131299643), false, null);
          if (r.amo(str))
          {
            localObject2 = ((List)localObject2).iterator();
            while (((Iterator)localObject2).hasNext())
            {
              str = (String)((Iterator)localObject2).next();
              i.a(this.mController.ylL, str, localf.mij, localf.cAv, new FavMediaGalleryUI.11(this, (Dialog)localObject1));
            }
          }
          localObject1 = new FavMediaGalleryUI.2(this, (Dialog)localObject1);
          localObject2 = ((List)localObject2).iterator();
          while (((Iterator)localObject2).hasNext())
            i.a(this, (String)((Iterator)localObject2).next(), localf.cAv, (Runnable)localObject1);
          super.onActivityResult(paramInt1, paramInt2, paramIntent);
          AppMethodBeat.o(74536);
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(74529);
    super.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 21)
      getWindow().setFlags(1024, 1024);
    this.cHc = getIntent().getBooleanExtra("show_share", true);
    this.kkn = ((MMGestureGallery)findViewById(2131822081));
    this.kkn.setVerticalFadingEdgeEnabled(false);
    this.kkn.setHorizontalFadingEdgeEnabled(false);
    this.kkn.setOnItemSelectedListener(this);
    this.kkn.setSingleClickOverListener(new FavMediaGalleryUI.1(this));
    if (this.cHc)
      this.kkn.setLongClickOverListener(new FavMediaGalleryUI.4(this));
    fullScreenNoTitleBar(true);
    this.iLD = new ArrayList();
    this.mnE = new FavMediaGalleryUI.a(this, (byte)0);
    this.kkn.setAdapter(this.mnE);
    Km();
    setBackBtn(new FavMediaGalleryUI.5(this));
    com.tencent.mm.sdk.b.a.xxA.c(this.mip);
    setResult(0, getIntent());
    this.mnG.scene = getIntent().getIntExtra("key_detail_fav_scene", 0);
    this.mnG.jSW = getIntent().getIntExtra("key_detail_fav_sub_scene", 0);
    this.mnG.index = getIntent().getIntExtra("key_detail_fav_index", 0);
    this.mnG.query = getIntent().getStringExtra("key_detail_fav_query");
    this.mnG.cvF = getIntent().getStringExtra("key_detail_fav_sessionid");
    this.mnG.mfg = getIntent().getStringExtra("key_detail_fav_tags");
    abh localabh = this.mnG;
    if (this.mnG.query == null)
    {
      paramBundle = "";
      localabh.query = paramBundle;
      localabh = this.mnG;
      if (this.mnG.cvF != null)
        break label393;
      paramBundle = "";
      label346: localabh.cvF = paramBundle;
      localabh = this.mnG;
      if (this.mnG.mfg != null)
        break label404;
    }
    label393: label404: for (paramBundle = ""; ; paramBundle = this.mnG.mfg)
    {
      localabh.mfg = paramBundle;
      AppMethodBeat.o(74529);
      return;
      paramBundle = this.mnG.query;
      break;
      paramBundle = this.mnG.cvF;
      break label346;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(74531);
    getIntent().putExtra("key_activity_browse_time", dyi());
    com.tencent.mm.sdk.b.a.xxA.d(this.mip);
    Iterator localIterator = this.mnF.iterator();
    while (localIterator.hasNext())
    {
      FavVideoView localFavVideoView = (FavVideoView)localIterator.next();
      if (localFavVideoView != null)
        localFavVideoView.onDestroy();
    }
    super.onDestroy();
    AppMethodBeat.o(74531);
  }

  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(74534);
    this.mik = paramInt;
    ab.d("MicroMsg.FavMediaGalleryUI", "pos:".concat(String.valueOf(paramInt)));
    if ((paramView instanceof MultiTouchImageView))
      ((MultiTouchImageView)paramView).dzA();
    if (this.mnD != null)
      this.mnD.onDestroy();
    if ((paramView instanceof FavVideoView))
    {
      paramAdapterView = (FavVideoView)paramView;
      if (((this.mnE.getItemViewType(paramInt) == 15) || (this.mnE.getItemViewType(paramInt) == 4)) && (paramAdapterView != null))
        if (paramAdapterView.klq != null)
          break label131;
    }
    label131: for (boolean bool = false; ; bool = paramAdapterView.klq.isPlaying())
    {
      if (!bool)
      {
        paramAdapterView.onResume();
        this.mnD = paramAdapterView;
        this.mnC = paramInt;
      }
      AppMethodBeat.o(74534);
      return;
    }
  }

  public void onNothingSelected(AdapterView<?> paramAdapterView)
  {
  }

  public void onPause()
  {
    AppMethodBeat.i(74533);
    super.onPause();
    ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().b(this);
    o.JV(2);
    AppMethodBeat.o(74533);
  }

  public void onResume()
  {
    AppMethodBeat.i(74532);
    super.onResume();
    ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().a(this);
    o.JV(1);
    AppMethodBeat.o(74532);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
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
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI
 * JD-Core Version:    0.6.2
 */