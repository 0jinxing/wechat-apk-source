package com.tencent.mm.plugin.gallery.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.y;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.s;
import com.tencent.mm.api.s.b;
import com.tencent.mm.compatible.f.b;
import com.tencent.mm.plugin.gallery.model.GalleryItem.MediaItem;
import com.tencent.mm.plugin.gallery.model.GalleryItem.VideoMediaItem;
import com.tencent.mm.plugin.gallery.model.l;
import com.tencent.mm.plugin.gallery.model.m;
import com.tencent.mm.plugin.gallery.stub.GalleryStubService;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.base.MMViewPager;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.q.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

@com.tencent.mm.ui.base.a(19)
@TargetApi(16)
public class ImagePreviewUI extends MMActivity
{
  private int gLP;
  private ServiceConnection ktl;
  private boolean kvs;
  private com.tencent.mm.plugin.gallery.stub.a mOG;
  private ArrayList<GalleryItem.MediaItem> mOH;
  private String mOL;
  private int mPA;
  private long mPF;
  private HashMap<String, Integer> mPN;
  private TextView mPo;
  private boolean mPu;
  private c mQS;
  private MMViewPager mQT;
  private RecyclerView mQU;
  private ArrayList<String> mQV;
  private ArrayList<String> mQW;
  private Integer mQX;
  private ImageButton mQY;
  private TextView mQZ;
  private boolean mQm;
  private ap mRa;
  private ImageButton mRb;
  private TextView mRc;
  private ViewGroup mRd;
  private ViewGroup mRe;
  private boolean mRf;
  private boolean mRg;
  private int mRh;
  private int mRi;
  private TextView mRj;
  private TextView mRk;
  private TextView mRl;
  private TextView mRm;
  private View mRn;
  private TextView mRo;
  private ProgressBar mRp;
  boolean mRq;
  private int mRr;
  private String mRs;
  private HashSet<String> mRt;

  public ImagePreviewUI()
  {
    AppMethodBeat.i(21529);
    this.mRf = true;
    this.mRg = true;
    this.mPu = true;
    this.mRh = 0;
    this.mPF = 0L;
    this.mRi = 10;
    this.mOG = null;
    this.ktl = new ImagePreviewUI.1(this);
    this.mRq = false;
    this.mPN = new HashMap();
    this.mRr = 300000;
    AppMethodBeat.o(21529);
  }

  private void NE(String paramString)
  {
    AppMethodBeat.i(21535);
    Object localObject;
    if (!this.mQW.contains(paramString))
      if (this.mQW.size() >= this.mPA)
      {
        localObject = getResources().getQuantityString(2131361804, this.mPA, new Object[] { Integer.valueOf(this.mPA) });
        paramString = (String)localObject;
        if (!bo.isNullOrNil(this.mOL))
        {
          paramString = (String)localObject;
          if (this.mOL.equals("album_business_bubble_media_by_coordinate"))
            paramString = getResources().getQuantityString(2131361805, this.mPA, new Object[] { Integer.valueOf(this.mPA) });
        }
        h.bQ(this.mController.ylL, paramString);
        this.mRb.setImageResource(2131231120);
        paramString = this.mQW.iterator();
        while (paramString.hasNext())
          if (!r.amo((String)paramString.next()))
            AppMethodBeat.o(21535);
      }
    while (true)
    {
      return;
      localObject = com.tencent.mm.plugin.gallery.model.e.NB(paramString);
      if (localObject != null)
      {
        if ((((GalleryItem.MediaItem)localObject).mMimeType.equalsIgnoreCase("image/gif")) && (!((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getProvider().Jq(paramString)))
        {
          h.bQ(this, getString(2131300196));
          AppMethodBeat.o(21535);
        }
        else if ((!bo.isNullOrNil(this.mOL)) && (this.mOL.equals("album_business_bubble_media_by_coordinate")) && ((localObject instanceof GalleryItem.VideoMediaItem)) && (((GalleryItem.VideoMediaItem)localObject).fPW >= this.gLP * 1000 + 500))
        {
          h.bQ(this.mController.ylL, this.mController.ylL.getResources().getString(2131300214));
          AppMethodBeat.o(21535);
        }
      }
      else
      {
        this.mQW.add(paramString);
        this.mRb.setImageResource(2131231117);
        b(this.mQW.size(), this.mQX.intValue(), paramString, 0);
        break;
        this.mRb.setImageResource(2131231120);
        while (this.mQW.remove(paramString));
        b(this.mQW.size(), this.mQX.intValue(), paramString, 1);
        break;
        this.kvs = true;
        AppMethodBeat.o(21535);
      }
    }
  }

  private void NF(String paramString)
  {
    AppMethodBeat.i(21545);
    if ((this.mQW.size() >= 9) && (!this.mQW.contains(paramString)))
    {
      this.mRj.setTextColor(this.mController.ylL.getResources().getColor(2131690694));
      this.mRj.setEnabled(false);
      AppMethodBeat.o(21545);
    }
    while (true)
    {
      return;
      this.mRj.setEnabled(true);
      this.mRj.setTextColor(this.mController.ylL.getResources().getColor(2131690693));
      AppMethodBeat.o(21545);
    }
  }

  private boolean NG(String paramString)
  {
    AppMethodBeat.i(21548);
    boolean bool;
    if (com.tencent.mm.vfs.e.asZ(paramString) > 1073741824L)
    {
      this.mRk.setText(getString(2131300190));
      this.mRl.setText(getString(2131300189));
      bool = true;
      AppMethodBeat.o(21548);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(21548);
    }
  }

  private boolean NH(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(21553);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(21553);
    while (true)
    {
      return bool;
      if (this.mRt == null)
      {
        this.mRt = new HashSet();
        this.mRt.add(".h264");
        this.mRt.add(".h26l");
        this.mRt.add(".264");
        this.mRt.add(".avc");
        this.mRt.add(".mov");
        this.mRt.add(".mp4");
        this.mRt.add(".m4a");
        this.mRt.add(".3gp");
        this.mRt.add(".3g2");
        this.mRt.add(".mj2");
        this.mRt.add(".m4v");
      }
      paramString = paramString.trim();
      int i = paramString.lastIndexOf(".");
      if ((i < 0) || (i >= paramString.length()))
      {
        AppMethodBeat.o(21553);
      }
      else if (!this.mRt.contains(paramString.substring(i)))
      {
        AppMethodBeat.o(21553);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(21553);
      }
    }
  }

  private void NI(String paramString)
  {
    AppMethodBeat.i(21555);
    Object localObject = Boolean.FALSE;
    Boolean localBoolean;
    GalleryItem.MediaItem localMediaItem;
    switch (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ)
    {
    default:
      localBoolean = Boolean.FALSE;
      localMediaItem = com.tencent.mm.plugin.gallery.model.e.NB(paramString);
      localObject = localBoolean;
      if (localMediaItem != null)
      {
        localObject = localBoolean;
        if (localMediaItem.getType() == 2)
          localObject = Boolean.TRUE;
      }
      if ((localMediaItem == null) && (r.amo(paramString)))
      {
        paramString = Boolean.TRUE;
        label108: if (!paramString.booleanValue())
          break label176;
        this.mQY.setVisibility(8);
        this.mPo.setVisibility(8);
        AppMethodBeat.o(21555);
      }
      break;
    case 4:
    case 7:
    case 13:
    case 14:
    }
    while (true)
    {
      return;
      localBoolean = Boolean.TRUE;
      break;
      paramString = (String)localObject;
      if (localMediaItem == null)
        break label108;
      paramString = (String)localObject;
      if (!localMediaItem.mMimeType.equalsIgnoreCase("image/gif"))
        break label108;
      paramString = Boolean.TRUE;
      break label108;
      label176: this.mQY.setVisibility(0);
      this.mPo.setVisibility(0);
      AppMethodBeat.o(21555);
    }
  }

  private void a(String paramString, GalleryItem.MediaItem paramMediaItem)
  {
    AppMethodBeat.i(21544);
    if ((paramMediaItem == null) || (paramMediaItem.getType() != 2) || ((com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ != 4) && (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ != 14) && (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ != 13)))
    {
      this.mRf = true;
      this.mRd.setVisibility(0);
      this.mRe.setVisibility(8);
      this.mRp.setVisibility(8);
      b(paramString, paramMediaItem);
      NI(paramString);
      enableOptionMenu(true);
      this.mQZ.setVisibility(8);
      if ((paramMediaItem != null) && (paramMediaItem.getType() == 1) && (!paramMediaItem.mMimeType.equalsIgnoreCase("image/gif")))
      {
        this.mRj.setVisibility(0);
        NF(paramString);
        AppMethodBeat.o(21544);
      }
    }
    while (true)
    {
      return;
      boolean bool = getIntent().getBooleanExtra("preview_image", false);
      ab.i("MicroMsg.ImagePreviewUI", "QuerySource:%s isPreViewImage:%s  path:%s", new Object[] { Integer.valueOf(com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ), Boolean.valueOf(bool), paramString });
      if ((paramMediaItem == null) && (!bo.isNullOrNil(paramString)))
      {
        this.mRj.setVisibility(0);
        break;
      }
      this.mRj.setVisibility(8);
      break;
      if ((paramMediaItem != null) && (paramMediaItem.getType() == 1) && (!paramMediaItem.mMimeType.equalsIgnoreCase("image/gif")))
        this.mRj.setVisibility(0);
      GalleryItem.VideoMediaItem localVideoMediaItem;
      while (true)
      {
        NF(paramString);
        localVideoMediaItem = (GalleryItem.VideoMediaItem)paramMediaItem;
        enableOptionMenu(false);
        this.mRf = false;
        this.mRd.setVisibility(8);
        this.mRe.setVisibility(0);
        this.mRo.setVisibility(8);
        if (!NG(paramString))
          break label340;
        AppMethodBeat.o(21544);
        break;
        this.mRj.setVisibility(8);
      }
      label340: if (!bo.isNullOrNil(localVideoMediaItem.fPU))
      {
        ab.d("MicroMsg.ImagePreviewUI", "got MediaItem directly path [%s], durationMs [%d], videoHeight[%d], videoWidth [%d]", new Object[] { localVideoMediaItem.fPT, Integer.valueOf(localVideoMediaItem.fPW), Integer.valueOf(localVideoMediaItem.videoHeight), Integer.valueOf(localVideoMediaItem.videoWidth) });
        a(paramString, localVideoMediaItem);
        AppMethodBeat.o(21544);
      }
      else
      {
        enableOptionMenu(false);
        this.mRf = true;
        this.mRd.setVisibility(0);
        this.mRe.setVisibility(8);
        this.mQZ.setVisibility(8);
        b(paramString, paramMediaItem);
        NI(paramString);
        paramMediaItem = new m(paramString, this.mQX.intValue(), localVideoMediaItem, new ImagePreviewUI.17(this));
        if (com.tencent.mm.sdk.g.d.xDG.ao(paramMediaItem))
        {
          ab.d("MicroMsg.ImagePreviewUI", "analysis of path[%s] has already been added in ThreadPool", new Object[] { paramString });
          AppMethodBeat.o(21544);
        }
        else
        {
          com.tencent.mm.sdk.g.d.post(paramMediaItem, "video_analysis");
          AppMethodBeat.o(21544);
        }
      }
    }
  }

  private void a(String paramString, GalleryItem.VideoMediaItem paramVideoMediaItem)
  {
    AppMethodBeat.i(21546);
    enableOptionMenu(false);
    this.mRf = false;
    this.mRd.setVisibility(8);
    this.mRe.setVisibility(0);
    this.mRo.setVisibility(8);
    if (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ == 13)
    {
      this.mRe.setVisibility(8);
      this.mRd.setVisibility(8);
      this.mRk.setVisibility(8);
      this.mRl.setVisibility(8);
      enableOptionMenu(true);
      AppMethodBeat.o(21546);
    }
    while (true)
    {
      return;
      if (b(paramVideoMediaItem))
      {
        AppMethodBeat.o(21546);
      }
      else if (c(paramVideoMediaItem))
      {
        AppMethodBeat.o(21546);
      }
      else if (a(paramVideoMediaItem))
      {
        AppMethodBeat.o(21546);
      }
      else
      {
        enableOptionMenu(true);
        this.mRf = true;
        this.mRd.setVisibility(0);
        this.mRe.setVisibility(8);
        this.mQZ.setVisibility(0);
        this.mRp.setVisibility(8);
        b(paramString, paramVideoMediaItem);
        NI(paramString);
        AppMethodBeat.o(21546);
      }
    }
  }

  private boolean a(GalleryItem.VideoMediaItem paramVideoMediaItem)
  {
    boolean bool = false;
    AppMethodBeat.i(21549);
    ab.d("MicroMsg.ImagePreviewUI", "check duration %d", new Object[] { Integer.valueOf(paramVideoMediaItem.fPW) });
    if (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ == 13)
      AppMethodBeat.o(21549);
    while (true)
    {
      return bool;
      if (paramVideoMediaItem.fPW <= 1000)
      {
        this.mRk.setText(getString(2131300194));
        this.mRl.setText(getString(2131300193));
        AppMethodBeat.o(21549);
        bool = true;
      }
      else if (paramVideoMediaItem.fPW >= 300000)
      {
        this.mRk.setText(getString(2131300192));
        this.mRl.setText(getString(2131300191));
        AppMethodBeat.o(21549);
        bool = true;
      }
      else if (paramVideoMediaItem.fPW >= this.mRi * 1000 + 500)
      {
        this.mRk.setText(getString(2131300181));
        this.mRl.setText(getString(2131300180, new Object[] { Integer.valueOf(this.mRi) }));
        this.mRo.setVisibility(0);
        AppMethodBeat.o(21549);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(21549);
      }
    }
  }

  private void b(int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    AppMethodBeat.i(21556);
    ab.i("MicroMsg.ImagePreviewUI", "count:%s selectPosition:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((-1 != paramInt2) && (!this.mQm))
      this.mQU.getAdapter().b(paramInt2, Integer.valueOf(paramInt2));
    label274: label289: 
    while (true)
    {
      if (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ == 13)
      {
        paramInt2 = 1;
        label73: paramString = this.mQS.wz(this.mQX.intValue());
        if ((paramInt1 != 0) && (((!this.mPu) && (paramInt2 == 0)) || (this.mQS == null) || (paramString == null) || (paramString.getType() != 2)))
          break label274;
        this.mQU.setVisibility(8);
        AppMethodBeat.o(21556);
      }
      while (true)
      {
        return;
        if (-1 == paramInt2)
          break label289;
        if ((paramInt3 == 0) && (paramInt1 > 0))
        {
          ((f)this.mQU.getAdapter()).addItem(paramString);
          ((f)this.mQU.getAdapter()).el(paramInt1 - 1, this.mQX.intValue());
          this.mQU.getAdapter().ch(paramInt1 - 1);
          this.mQU.smoothScrollToPosition(paramInt1 - 1);
          break;
        }
        if (paramInt3 != 1)
          break;
        paramInt2 = ((f)this.mQU.getAdapter()).indexOf(paramString);
        if (-1 == paramInt2)
          break;
        ((f)this.mQU.getAdapter()).remove(paramInt2);
        this.mQU.getAdapter().ci(paramInt2);
        break;
        paramInt2 = 0;
        break label73;
        this.mQU.setVisibility(0);
        AppMethodBeat.o(21556);
      }
    }
  }

  private void b(GalleryItem.MediaItem paramMediaItem)
  {
    AppMethodBeat.i(21547);
    if (paramMediaItem == null)
    {
      ab.e("MicroMsg.ImagePreviewUI", "[updateTopTip] null == item");
      AppMethodBeat.o(21547);
    }
    while (true)
    {
      return;
      Object localObject;
      if (paramMediaItem.getType() == 2)
      {
        GalleryItem.VideoMediaItem localVideoMediaItem = (GalleryItem.VideoMediaItem)paramMediaItem;
        this.mRr = 300000;
        this.mRs = getString(2131300191);
        if ((this.mOL != null) && (this.mOL.equals("album_business_bubble_media_by_coordinate")))
        {
          this.mRr = (this.gLP * 1000 + 500);
          this.mRs = getString(2131300214, new Object[] { Integer.valueOf(this.gLP) });
        }
        if (!bo.isNullOrNil(localVideoMediaItem.fPU))
        {
          ab.d("MicroMsg.ImagePreviewUI", "path [%s], durationMs [%d], videoHeight[%d], videoWidth [%d]", new Object[] { localVideoMediaItem.fPT, Integer.valueOf(localVideoMediaItem.fPW), Integer.valueOf(localVideoMediaItem.videoHeight), Integer.valueOf(localVideoMediaItem.videoWidth) });
          if ((localVideoMediaItem.fPW >= this.mRr) || ((localVideoMediaItem.fPW > 0) && (localVideoMediaItem.fPW < 1000)))
          {
            this.mRn.setVisibility(0);
            localObject = this.mRm;
            if (localVideoMediaItem.fPW >= this.mRr);
            for (paramMediaItem = this.mRs; ; paramMediaItem = getString(2131300193))
            {
              ((TextView)localObject).setText(paramMediaItem);
              this.mRc.setEnabled(false);
              this.mRb.setEnabled(false);
              this.mRc.setTextColor(getResources().getColor(2131690694));
              if (this.mQW.size() != 0)
                break label433;
              enableOptionMenu(false);
              AppMethodBeat.o(21547);
              break;
            }
          }
          this.mRc.setEnabled(true);
          this.mRb.setEnabled(true);
          this.mRc.setTextColor(getResources().getColor(2131690693));
          this.mRn.setVisibility(8);
          AppMethodBeat.o(21547);
        }
        else
        {
          localObject = new m(paramMediaItem.fPT, this.mQX.intValue(), localVideoMediaItem, new ImagePreviewUI.18(this));
          if (com.tencent.mm.sdk.g.d.xDG.ao((Runnable)localObject))
          {
            ab.d("MicroMsg.ImagePreviewUI", "analysis of path[%s] has already been added in ThreadPool", new Object[] { paramMediaItem.fPT });
            AppMethodBeat.o(21547);
          }
          else
          {
            com.tencent.mm.sdk.g.d.post((Runnable)localObject, "video_analysis");
            label433: AppMethodBeat.o(21547);
          }
        }
      }
      else if ((paramMediaItem.getType() == 1) && (!paramMediaItem.mMimeType.equalsIgnoreCase("image/gif")))
      {
        this.mRc.setEnabled(true);
        this.mRb.setEnabled(true);
        this.mRc.setTextColor(getResources().getColor(2131690693));
        if ((this.kvs) && (this.mQW.contains(paramMediaItem.fPT)) && (com.tencent.mm.vfs.e.asZ(paramMediaItem.fPT) > 26214400L))
        {
          this.mRn.setVisibility(0);
          this.mRm.setText(getString(2131300198));
          AppMethodBeat.o(21547);
        }
        else
        {
          this.mRn.setVisibility(8);
          AppMethodBeat.o(21547);
        }
      }
      else if ((paramMediaItem.getType() == 1) && (paramMediaItem.mMimeType.equalsIgnoreCase("image/gif")))
      {
        localObject = new com.tencent.mm.plugin.gif.f(paramMediaItem.fPT);
        long l = com.tencent.mm.vfs.e.asZ(paramMediaItem.fPT);
        try
        {
          if (((!this.mQW.contains(paramMediaItem.fPT)) || (l == 0L) || (l <= this.mOG.Nb())) && (localObject.noD[0] <= this.mOG.Na()) && (localObject.noD[1] <= this.mOG.Na()))
            break label755;
          this.mRc.setTextColor(getResources().getColor(2131690694));
          this.mRc.setEnabled(false);
          this.mRb.setEnabled(false);
          AppMethodBeat.o(21547);
        }
        catch (Exception paramMediaItem)
        {
          ab.e("MicroMsg.ImagePreviewUI", bo.l(paramMediaItem));
        }
      }
      else
      {
        AppMethodBeat.o(21547);
        continue;
        label755: this.mRc.setTextColor(getResources().getColor(2131690693));
        this.mRc.setEnabled(true);
        this.mRb.setEnabled(true);
        AppMethodBeat.o(21547);
      }
    }
  }

  private void b(String paramString, GalleryItem.MediaItem paramMediaItem)
  {
    AppMethodBeat.i(21554);
    if ((paramMediaItem == null) || (paramMediaItem.getType() != 2) || (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ != 4))
      if (this.mPA == 1)
      {
        this.mRb.setVisibility(8);
        this.mRc.setVisibility(8);
        if (this.mQW.contains(paramString))
          break label100;
        this.mRb.setImageResource(2131231120);
        AppMethodBeat.o(21554);
      }
    while (true)
    {
      return;
      this.mRb.setVisibility(0);
      this.mRc.setVisibility(0);
      break;
      label100: this.mRb.setImageResource(2131231117);
      AppMethodBeat.o(21554);
      continue;
      this.mRb.setVisibility(8);
      this.mRc.setVisibility(8);
      AppMethodBeat.o(21554);
    }
  }

  private boolean b(GalleryItem.VideoMediaItem paramVideoMediaItem)
  {
    boolean bool = false;
    AppMethodBeat.i(21551);
    if ((paramVideoMediaItem == null) || (paramVideoMediaItem.videoWidth <= 0) || (paramVideoMediaItem.videoHeight <= 0) || (paramVideoMediaItem.videoWidth / paramVideoMediaItem.videoHeight > 3.0F) || (paramVideoMediaItem.videoWidth / paramVideoMediaItem.videoHeight < 0.3F))
    {
      if (paramVideoMediaItem != null)
        ab.d("MicroMsg.ImagePreviewUI", "check ratio faild width = [%d], height = [%d]", new Object[] { Integer.valueOf(paramVideoMediaItem.videoWidth), Integer.valueOf(paramVideoMediaItem.videoHeight) });
      this.mRk.setText(getString(2131300187));
      this.mRl.setText(getString(2131300188));
      AppMethodBeat.o(21551);
      bool = true;
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(21551);
    }
  }

  private String bCJ()
  {
    AppMethodBeat.i(21537);
    String str;
    switch (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ)
    {
    case 5:
    case 6:
    case 9:
    case 10:
    case 12:
    default:
      if ((this.mQW.size() == 0) || (this.mPA <= 1))
      {
        str = getString(2131297041);
        AppMethodBeat.o(21537);
      }
      break;
    case 4:
    case 8:
    case 13:
    case 14:
    case 11:
    case 7:
    }
    while (true)
    {
      return str;
      if ((this.mQW.size() == 0) || (this.mPA <= 1))
      {
        str = getString(2131300184);
        AppMethodBeat.o(21537);
      }
      else
      {
        str = getString(2131300184) + "(" + this.mQW.size() + "/" + this.mPA + ")";
        AppMethodBeat.o(21537);
        continue;
        str = getString(2131299171);
        AppMethodBeat.o(21537);
        continue;
        if ((!bo.isNullOrNil(this.mOL)) && (this.mOL.equals("album_business_bubble_media_by_coordinate")))
        {
          if ((this.mQW.size() == 0) || (this.mPA <= 1))
          {
            str = getString(2131296989);
            AppMethodBeat.o(21537);
          }
          else
          {
            str = getString(2131296989) + "(" + this.mQW.size() + "/" + this.mPA + ")";
            AppMethodBeat.o(21537);
          }
        }
        else if ((this.mQW.size() == 0) || (this.mPA <= 1))
        {
          str = getString(2131300184);
          AppMethodBeat.o(21537);
        }
        else
        {
          str = getString(2131300184) + "(" + this.mQW.size() + "/" + this.mPA + ")";
          AppMethodBeat.o(21537);
          continue;
          str = getString(2131300176, new Object[] { Integer.valueOf(this.mQW.size()), Integer.valueOf(this.mPA) });
          AppMethodBeat.o(21537);
        }
      }
    }
  }

  private ArrayList<String> bCK()
  {
    AppMethodBeat.i(21538);
    ArrayList localArrayList;
    if (this.mQm)
    {
      localArrayList = this.mQW;
      AppMethodBeat.o(21538);
    }
    while (true)
    {
      return localArrayList;
      localArrayList = new ArrayList(this.mQW.size());
      Iterator localIterator = this.mQV.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (this.mQW.contains(str))
          localArrayList.add(str);
      }
      AppMethodBeat.o(21538);
    }
  }

  private boolean bCL()
  {
    AppMethodBeat.i(21550);
    this.mRk.setText(getString(2131300185));
    this.mRl.setText(getString(2131300186));
    AppMethodBeat.o(21550);
    return true;
  }

  private boolean c(GalleryItem.VideoMediaItem paramVideoMediaItem)
  {
    AppMethodBeat.i(21552);
    ab.d("MicroMsg.ImagePreviewUI", "updateBottomLayoutCheckFormat() called with: item = [%s]", new Object[] { paramVideoMediaItem });
    int i;
    if (paramVideoMediaItem != null)
      if (("video/hevc".equalsIgnoreCase(paramVideoMediaItem.fPU)) && (com.tencent.mm.plugin.n.e.bOS()))
        i = 1;
    while (true)
    {
      if ((paramVideoMediaItem == null) || (bo.isNullOrNil(paramVideoMediaItem.fPT)) || (NH(paramVideoMediaItem.fPT)) || (i == 0) || ((!bo.isNullOrNil(paramVideoMediaItem.fPV)) && (!"audio/mp4a-latm".equalsIgnoreCase(paramVideoMediaItem.fPV))))
        if (paramVideoMediaItem == null)
        {
          paramVideoMediaItem = null;
          label106: ab.d("MicroMsg.ImagePreviewUI", "check video format failed, dst format [video/avc], video format [%s]", new Object[] { paramVideoMediaItem });
          bCL();
          AppMethodBeat.o(21552);
        }
      for (boolean bool = true; ; bool = false)
      {
        return bool;
        if (!"video/avc".equalsIgnoreCase(paramVideoMediaItem.fPU))
          break label175;
        i = 1;
        break;
        paramVideoMediaItem = paramVideoMediaItem.fPU;
        break label106;
        AppMethodBeat.o(21552);
      }
      label175: i = 0;
    }
  }

  private void goBack()
  {
    boolean bool1 = true;
    AppMethodBeat.i(21541);
    Intent localIntent = new Intent();
    boolean bool2;
    if (!this.kvs)
    {
      bool2 = true;
      if (!this.mPu)
        break label89;
      bool2 = bool1;
    }
    label89: 
    while (true)
    {
      localIntent.putExtra("CropImage_Compress_Img", bool2);
      localIntent.putStringArrayListExtra("preview_image_list", bCK());
      localIntent.putExtra("show_photo_edit_tip", this.mRq);
      setResult(0, localIntent);
      finish();
      AppMethodBeat.o(21541);
      return;
      bool2 = false;
      break;
    }
  }

  private void hF(boolean paramBoolean)
  {
    AppMethodBeat.i(21539);
    if (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ == 4)
      AppMethodBeat.o(21539);
    while (true)
    {
      return;
      if (this.mQS == null)
      {
        ab.i("MicroMsg.ImagePreviewUI", "[setTopTipVisibility] adapter == null");
        AppMethodBeat.o(21539);
      }
      else
      {
        GalleryItem.MediaItem localMediaItem = this.mQS.wz(this.mQX.intValue());
        if ((paramBoolean) && (localMediaItem != null))
        {
          this.mRn.postDelayed(new ImagePreviewUI.16(this, localMediaItem), 400L);
          AppMethodBeat.o(21539);
        }
        else
        {
          this.mRn.setVisibility(8);
          AppMethodBeat.o(21539);
        }
      }
    }
  }

  private void hG(boolean paramBoolean)
  {
    AppMethodBeat.i(21540);
    ab.d("MicroMsg.ImagePreviewUI", "setFooterVisibility() called with: visible = [" + paramBoolean + "], selectedNormalFooter = " + this.mRf);
    Object localObject;
    if (this.mRf)
    {
      localObject = findViewById(2131823176);
      if (localObject != null)
        break label121;
      if (!this.mRf)
        break label114;
      localObject = "normal";
      label72: ab.w("MicroMsg.ImagePreviewUI", "set footer[%s] visibility[%B], but footerbar null", new Object[] { localObject, Boolean.valueOf(paramBoolean) });
      AppMethodBeat.o(21540);
    }
    while (true)
    {
      return;
      localObject = findViewById(2131825001);
      break;
      label114: localObject = "edit_tips";
      break label72;
      label121: if (((paramBoolean) && (((View)localObject).getVisibility() == 0)) || ((!paramBoolean) && (((View)localObject).getVisibility() == 8)))
      {
        AppMethodBeat.o(21540);
      }
      else
      {
        if (paramBoolean)
        {
          ((View)localObject).setVisibility(0);
          ((View)localObject).startAnimation(AnimationUtils.loadAnimation(this, 2131034180));
        }
        while (true)
        {
          if ((!paramBoolean) || (this.mQU.getVisibility() != 8) || (this.mQW.size() <= 0))
            break label253;
          this.mQU.setVisibility(0);
          localObject = AnimationUtils.loadAnimation(this, 2131034180);
          this.mQU.startAnimation((Animation)localObject);
          AppMethodBeat.o(21540);
          break;
          ((View)localObject).setVisibility(8);
          ((View)localObject).startAnimation(AnimationUtils.loadAnimation(this, 2131034181));
        }
        label253: if ((!paramBoolean) && (this.mQU.getVisibility() == 0))
        {
          this.mQU.setVisibility(8);
          localObject = AnimationUtils.loadAnimation(this, 2131034181);
          this.mQU.startAnimation((Animation)localObject);
        }
        AppMethodBeat.o(21540);
      }
    }
  }

  public final void dealContentView(View paramView)
  {
    AppMethodBeat.i(21533);
    if (b.bD(this))
    {
      setContentView(paramView);
      AppMethodBeat.o(21533);
    }
    while (true)
    {
      return;
      ae.h(ae.a(getWindow(), null), this.mController.ylv);
      ((ViewGroup)this.mController.ylv.getParent()).removeView(this.mController.ylv);
      ((ViewGroup)getWindow().getDecorView()).addView(this.mController.ylv, 0);
      AppMethodBeat.o(21533);
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969856;
  }

  public final void initView()
  {
    AppMethodBeat.i(21534);
    this.mRk = ((TextView)findViewById(2131825002));
    this.mRl = ((TextView)findViewById(2131825004));
    this.mRm = ((TextView)findViewById(2131824994));
    this.mRn = findViewById(2131824993);
    this.mRn.postDelayed(new ImagePreviewUI.21(this), 100L);
    this.mRo = ((TextView)findViewById(2131825003));
    this.mRp = ((ProgressBar)findViewById(2131824997));
    this.mPA = getIntent().getIntExtra("max_select_count", 9);
    this.mRi = getIntent().getIntExtra("key_edit_video_max_time_length", 10);
    Object localObject1;
    boolean bool2;
    if (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ == 4)
    {
      bool1 = true;
      this.mPu = bool1;
      localObject1 = getIntent();
      this.mQV = ((Intent)localObject1).getStringArrayListExtra("preview_image_list");
      this.mQW = new ArrayList();
      if (this.mQV != null)
        this.mQW.addAll(this.mQV);
      this.mOH = com.tencent.mm.plugin.gallery.model.e.bCb();
      bool2 = ((Intent)localObject1).getBooleanExtra("preview_all", false);
      if (this.mOH != null)
        break label381;
    }
    label381: for (boolean bool1 = true; ; bool1 = false)
    {
      ab.i("MicroMsg.ImagePreviewUI", "preview all[%B] mediaitems is null[%B]", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      if ((bool2) && (this.mOH != null))
      {
        this.mQm = true;
        this.mQX = Integer.valueOf(((Intent)localObject1).getIntExtra("preview_position", 0));
        ab.i("MicroMsg.ImagePreviewUI", "start position=%d", new Object[] { this.mQX });
        if (this.mQX.intValue() >= 0);
      }
      else
      {
        this.mQX = Integer.valueOf(0);
      }
      com.tencent.mm.plugin.gallery.model.e.wk(this.mQX.intValue());
      if ((this.mQm) || ((this.mQW != null) && (this.mQW.size() != 0)))
        break label386;
      ab.e("MicroMsg.ImagePreviewUI", "not preview all items and imagepaths is null or empty");
      finish();
      AppMethodBeat.o(21534);
      return;
      bool1 = false;
      break;
    }
    label386: this.mQY = ((ImageButton)findViewById(2131822755));
    this.mPo = ((TextView)findViewById(2131822756));
    this.mQZ = ((TextView)findViewById(2131824996));
    this.kvs = ((Intent)localObject1).getBooleanExtra("send_raw_img", false);
    this.mRh = ((Intent)localObject1).getIntExtra("query_source_type", 0);
    label469: Object localObject2;
    int i;
    if (this.kvs)
    {
      this.mQY.setImageResource(2131231853);
      if ((this.mQW != null) && (this.mQW.size() == 1))
      {
        localObject2 = (String)this.mQW.get(0);
        if (((String)localObject2).endsWith(".jpg"))
          al.d(new ImagePreviewUI.10(this, (String)localObject2));
      }
      this.mPo.setText(this.mController.ylL.getString(2131300182));
      this.mQY.setOnClickListener(new ImagePreviewUI.22(this));
      this.mQZ.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(21522);
          String str = ImagePreviewUI.h(ImagePreviewUI.this).getItem(ImagePreviewUI.g(ImagePreviewUI.this).intValue());
          if (bo.isNullOrNil(str))
          {
            ab.w("MicroMsg.ImagePreviewUI", "get path error, position %d", new Object[] { ImagePreviewUI.g(ImagePreviewUI.this) });
            AppMethodBeat.o(21522);
          }
          while (true)
          {
            return;
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("key_video_path", str);
            paramAnonymousView.putExtra("key_need_clip_video_first", false);
            if (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ == 14)
              paramAnonymousView.putExtra("key_need_remux_video", false);
            paramAnonymousView.putExtra("key_max_duration_seconds", ImagePreviewUI.i(ImagePreviewUI.this));
            com.tencent.mm.bp.d.b(ImagePreviewUI.this.mController.ylL, "mmsight", ".segment.MMSightEditUI", paramAnonymousView, 4370);
            AppMethodBeat.o(21522);
          }
        }
      });
      this.mRo.setOnClickListener(new ImagePreviewUI.24(this));
      this.mPo.setOnClickListener(new ImagePreviewUI.25(this));
      setBackBtn(new ImagePreviewUI.26(this));
      this.mOL = ((Intent)localObject1).getStringExtra("album_business_tag");
      this.gLP = ((Intent)localObject1).getIntExtra("album_video_max_duration", 10);
      a(0, bCJ(), new ImagePreviewUI.27(this), q.b.ymu);
      this.mRb = ((ImageButton)findViewById(2131824999));
      this.mRb.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(21499);
          paramAnonymousView = ImagePreviewUI.h(ImagePreviewUI.this).getItem(ImagePreviewUI.g(ImagePreviewUI.this).intValue());
          if (bo.isNullOrNil(paramAnonymousView))
          {
            ab.w("MicroMsg.ImagePreviewUI", "get path error, position %d", new Object[] { ImagePreviewUI.g(ImagePreviewUI.this) });
            AppMethodBeat.o(21499);
          }
          while (true)
          {
            return;
            ImagePreviewUI.a(ImagePreviewUI.this, paramAnonymousView);
            ImagePreviewUI.a(ImagePreviewUI.this, ImagePreviewUI.g(ImagePreviewUI.this).intValue());
            ImagePreviewUI.f(ImagePreviewUI.this).setText(ImagePreviewUI.this.mController.ylL.getString(2131300182) + ImagePreviewUI.bCM());
            ImagePreviewUI.this.updateOptionMenuText(0, ImagePreviewUI.n(ImagePreviewUI.this));
            AppMethodBeat.o(21499);
          }
        }
      });
      this.mRc = ((TextView)findViewById(2131824998));
      this.mRc.setOnClickListener(new ImagePreviewUI.3(this));
      if (this.mPA == 1)
      {
        this.mRb.setVisibility(8);
        this.mRc.setVisibility(8);
      }
      this.mRd = ((ViewGroup)findViewById(2131823176));
      this.mRe = ((ViewGroup)findViewById(2131825001));
      if (this.mRd != null)
      {
        this.mRd.setVisibility(8);
        this.mRd.setOnClickListener(new ImagePreviewUI.4(this));
      }
      if (this.mRe != null)
      {
        this.mRe.setVisibility(8);
        this.mRe.setOnClickListener(new ImagePreviewUI.5(this));
      }
      this.mRj = ((TextView)findViewById(2131824995));
      this.mRj.setOnClickListener(new ImagePreviewUI.6(this));
      this.mQU = ((RecyclerView)findViewById(2131824992));
      this.mQU.getItemAnimator().aov = 66L;
      this.mQU.b(new ImagePreviewUI.7(this));
      localObject1 = new g();
      ((g)localObject1).setOrientation(0);
      this.mQU.setLayoutManager((RecyclerView.i)localObject1);
      i = getResources().getDisplayMetrics().widthPixels / 7;
      localObject1 = new f(this, this.mQW, i, this.mQm);
      this.mQU.setAdapter((RecyclerView.a)localObject1);
      this.mQU.post(new ImagePreviewUI.8(this));
      if (this.mQW.size() <= 0)
        break label1348;
      this.mQU.setVisibility(0);
      label1015: this.mQU.setItemAnimator(new y());
      ((f)localObject1).mRL.i(this.mQU);
      ((f)localObject1).mRF = new ImagePreviewUI.9(this);
      this.mQT = ((MMViewPager)findViewById(2131822081));
      this.mQT.setVerticalFadingEdgeEnabled(false);
      this.mQT.setHorizontalFadingEdgeEnabled(false);
      this.mQT.setOnPageChangeListener(new ImagePreviewUI.13(this));
      this.mQT.setSingleClickOverListener(new ImagePreviewUI.14(this));
      this.mQS = new c(this);
      ((f)this.mQU.getAdapter()).mRC = this.mQS;
      if (this.mQm)
        break label1360;
      this.mQS.E(this.mQV);
      this.mQS.mQm = false;
      if (this.mQV.size() <= 0)
        break label1463;
      localObject1 = (String)this.mQV.get(this.mQX.intValue());
    }
    while (true)
    {
      this.mQT.setAdapter(this.mQS);
      this.mQT.setCurrentItem(this.mQX.intValue());
      i = bCK().indexOf(this.mQS.getItem(this.mQX.intValue()));
      ((f)this.mQU.getAdapter()).el(i, this.mQX.intValue());
      localObject2 = com.tencent.mm.plugin.gallery.model.e.NB((String)localObject1);
      a((String)localObject1, (GalleryItem.MediaItem)localObject2);
      b((GalleryItem.MediaItem)localObject2);
      setMMTitle(String.format("%d/%d", new Object[] { Integer.valueOf(this.mQX.intValue() + 1), Integer.valueOf(this.mQS.getCount()) }));
      AppMethodBeat.o(21534);
      break;
      this.mQY.setImageResource(2131231852);
      break label469;
      label1348: this.mQU.setVisibility(8);
      break label1015;
      label1360: localObject1 = this.mQS;
      localObject2 = this.mOH;
      ((c)localObject1).mOH.clear();
      ((c)localObject1).mOH.addAll((Collection)localObject2);
      ((c)localObject1).reset();
      ((c)localObject1).notifyDataSetChanged();
      this.mQS.mQm = true;
      if (this.mQX.intValue() >= this.mOH.size())
        this.mQX = Integer.valueOf(0);
      if (this.mOH.size() > 0)
        localObject1 = ((GalleryItem.MediaItem)this.mOH.get(this.mQX.intValue())).fPT;
      else
        label1463: localObject1 = "";
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(21536);
    ab.i("MicroMsg.ImagePreviewUI", "test onActivityResult");
    if (paramInt1 == 4371)
      if (paramInt2 == -1)
      {
        setResult(-1, paramIntent);
        finish();
      }
    String str1;
    Object localObject1;
    String str2;
    Object localObject2;
    while (true)
      if (paramInt1 == 4372)
        if ((paramInt2 == -1) && (paramIntent != null))
        {
          this.mRq = true;
          str1 = paramIntent.getStringExtra("raw_photo_path");
          localObject1 = com.tencent.mm.plugin.gallery.model.e.bCd().iterator();
          while (true)
            if (((Iterator)localObject1).hasNext())
              if (str1.equals(((Bundle)((Iterator)localObject1).next()).getString("raw_photo_path")))
              {
                ((Iterator)localObject1).remove();
                continue;
                if (this.mQW.size() > 0)
                {
                  NE((String)this.mQW.get(0));
                  break;
                }
                ab.e("MicroMsg.ImagePreviewUI", "selectedPath has unexpected size() [%d]", new Object[] { Integer.valueOf(this.mQW.size()) });
                break;
                if (paramInt1 != 4370)
                  break;
                if (paramInt2 == -1)
                  setResult(-1, paramIntent);
                if (paramIntent == null)
                  break;
                setResult(-1, paramIntent.putExtra("GalleryUI_IsSendImgBackground", true));
                finish();
                break;
              }
          com.tencent.mm.plugin.gallery.model.e.bCd().add(paramIntent.getBundleExtra("report_info"));
          localObject1 = paramIntent.getStringExtra("after_photo_edit");
          str2 = paramIntent.getStringExtra("tmp_photo_edit");
          ab.i("MicroMsg.ImagePreviewUI", "rawEditPhotoPath:%s lastEditPhotoPath;%s", new Object[] { str1, localObject1 });
          if (this.mQV != null)
          {
            this.mQV.clear();
            localObject2 = paramIntent.getStringArrayListExtra("preview_image_list");
            if (localObject2 != null)
              this.mQV.addAll((Collection)localObject2);
            localObject2 = this.mQS.wz(this.mQX.intValue());
            if (localObject2 == null)
            {
              ab.e("MicroMsg.ImagePreviewUI", "item is null!!! mPosition:%s rawEditPhotoPath:%s lastEditPhotoPath:%s", new Object[] { this.mQX, str1, localObject1 });
              AppMethodBeat.o(21536);
            }
          }
        }
    while (true)
    {
      return;
      ((GalleryItem.MediaItem)localObject2).mOi = str1;
      ((GalleryItem.MediaItem)localObject2).fPT = ((String)localObject1);
      ((GalleryItem.MediaItem)localObject2).lZg = ((String)localObject1);
      ((GalleryItem.MediaItem)localObject2).mOj = str2;
      ((GalleryItem.MediaItem)localObject2).mMimeType = "edit";
      com.tencent.mm.plugin.gallery.model.e.bCc().add(localObject2);
      com.tencent.mm.plugin.gallery.model.e.bBY().a(new ImagePreviewUI.11(this, paramIntent));
      com.tencent.mm.plugin.gallery.model.e.bBY().b((String)localObject1, ((GalleryItem.MediaItem)localObject2).getType(), (String)localObject1, ((GalleryItem.MediaItem)localObject2).mOk);
      ab.i("MicroMsg.ImagePreviewUI", "photo_edit_back!");
      AppMethodBeat.o(21536);
      continue;
      if (paramIntent != null)
      {
        setResult(-1, paramIntent.putExtra("GalleryUI_IsSendImgBackground", true));
        finish();
      }
      AppMethodBeat.o(21536);
    }
  }

  @TargetApi(16)
  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(21530);
    long l = bo.yz();
    super.onCreate(paramBundle);
    fullScreenNoTitleBar(true);
    new ak().post(new ImagePreviewUI.12(this, l));
    bindService(new Intent(this.mController.ylL, GalleryStubService.class), this.ktl, 1);
    initView();
    ab.v("MicroMsg.ImagePreviewUI", "test oncreate: %d", new Object[] { Long.valueOf(bo.az(l)) });
    AppMethodBeat.o(21530);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(21543);
    super.onDestroy();
    if ((com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ == 3) && (getIntent().getBooleanExtra("preview_image", false)) && (getIntent().getIntExtra("max_select_count", 0) == 1))
    {
      ab.i("MicroMsg.ImagePreviewUI", "clear photo edit cache!");
      s.ccQ.Ae().Ad();
    }
    if (this.mQS != null)
      this.mQS.release();
    com.tencent.mm.plugin.gallery.model.e.B(null);
    unbindService(this.ktl);
    AppMethodBeat.o(21543);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(21542);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      bool = true;
      AppMethodBeat.o(21542);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(21542);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(21532);
    if (this.mRa != null)
      this.mRa.stopTimer();
    super.onPause();
    AppMethodBeat.o(21532);
  }

  public void onResume()
  {
    AppMethodBeat.i(21531);
    super.onResume();
    AppMethodBeat.o(21531);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.ImagePreviewUI
 * JD-Core Version:    0.6.2
 */