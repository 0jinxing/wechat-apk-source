package com.tencent.mm.plugin.gallery.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.plugin.gallery.model.GalleryItem.AlbumItem;
import com.tencent.mm.plugin.gallery.model.GalleryItem.MediaItem;
import com.tencent.mm.plugin.gallery.model.g;
import com.tencent.mm.plugin.gallery.model.i;
import com.tencent.mm.plugin.gallery.model.i.a;
import com.tencent.mm.plugin.gallery.model.i.b;
import com.tencent.mm.plugin.gallery.model.i.c;
import com.tencent.mm.plugin.gallery.model.l;
import com.tencent.mm.plugin.gallery.stub.GalleryStubService;
import com.tencent.mm.plugin.mmsight.SightCaptureResult;
import com.tencent.mm.plugin.webview.ui.tools.widget.o;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.DrawedCallBackFrameLayout;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.q.b;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

@com.tencent.mm.ui.base.a(19)
public class AlbumPreviewUI extends MMActivity
  implements i.c
{
  static long start = 0L;
  private String cEV;
  private ProgressDialog ehJ;
  private int ehv;
  private int gLP;
  private ServiceConnection ktl;
  private boolean kvs;
  private double latitude;
  private double longitude;
  private com.tencent.mm.plugin.gallery.stub.a mOG;
  private String mOL;
  private int mPA;
  private int mPB;
  boolean mPC;
  private int mPD;
  private int mPE;
  private long mPF;
  private long mPG;
  private int mPH;
  private String mPI;
  private i.b mPJ;
  private long mPK;
  private a.a mPL;
  private boolean mPM;
  private HashMap<String, Integer> mPN;
  private GridView mPe;
  private TextView mPf;
  private boolean mPg;
  private boolean mPh;
  private TextView mPi;
  private a mPj;
  private TextView mPk;
  private TextView mPl;
  private TextView mPm;
  private ImageFolderMgrView mPn;
  private TextView mPo;
  private ImageButton mPp;
  private String mPq;
  private String mPr;
  private int mPs;
  private String mPt;
  private boolean mPu;
  private boolean mPv;
  private boolean mPw;
  private boolean mPx;
  private boolean mPy;
  private boolean mPz;
  private String toUser;

  public AlbumPreviewUI()
  {
    AppMethodBeat.i(21417);
    this.mPu = false;
    this.mPv = false;
    this.mPw = false;
    this.mPx = false;
    this.kvs = false;
    this.mPy = false;
    this.mPz = false;
    this.mPC = false;
    this.mPD = 0;
    this.mPE = 0;
    this.mOG = null;
    this.mPF = 0L;
    this.mPH = -1;
    this.ktl = new AlbumPreviewUI.1(this);
    this.mPK = -1L;
    this.mPL = new AlbumPreviewUI.8(this);
    this.mPM = false;
    this.mPN = new HashMap();
    AppMethodBeat.o(21417);
  }

  private static int[] D(ArrayList<GalleryItem.MediaItem> paramArrayList)
  {
    AppMethodBeat.i(21424);
    int[] arrayOfInt = new int[4];
    arrayOfInt[0] = paramArrayList.size();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      GalleryItem.MediaItem localMediaItem = (GalleryItem.MediaItem)paramArrayList.next();
      if (localMediaItem != null)
        if ((!bo.isNullOrNil(localMediaItem.mMimeType)) && (localMediaItem.mMimeType.equalsIgnoreCase("image/gif")))
          arrayOfInt[2] += 1;
        else if (localMediaItem.getType() == 2)
          arrayOfInt[3] += 1;
        else if (localMediaItem.getType() == 1)
          arrayOfInt[1] += 1;
    }
    AppMethodBeat.o(21424);
    return arrayOfInt;
  }

  private void a(GalleryItem.AlbumItem paramAlbumItem)
  {
    AppMethodBeat.i(21425);
    if (paramAlbumItem == null)
      AppMethodBeat.o(21425);
    while (true)
    {
      return;
      if (bo.bc(this.mPr, "").equals(paramAlbumItem.mOg))
      {
        ab.w("MicroMsg.AlbumPreviewUI", "want to reset folder, same folder, return");
        AppMethodBeat.o(21425);
      }
      else
      {
        com.tencent.mm.plugin.gallery.model.e.bCe().addAll(this.mPj.mOI);
        ab.d("MicroMsg.AlbumPreviewUI", "reset folder[%s], path[%s]", new Object[] { paramAlbumItem.mOg, paramAlbumItem.Wy() });
        this.mPq = paramAlbumItem.Wy();
        this.mPr = paramAlbumItem.mOg;
        if (paramAlbumItem.mOh != null)
          this.mPs = paramAlbumItem.mOh.getType();
        if (bo.isNullOrNil(this.mPq))
        {
          ab.w("MicroMsg.AlbumPreviewUI", "reset folder path failed");
          this.mPq = this.mPr;
        }
        Object localObject1;
        if (!bo.isNullOrNil(this.mPr))
        {
          localObject1 = this.mPj;
          localObject2 = this.mPL;
          if (localObject2 == null)
          {
            ab.w("MicroMsg.AlbumAdapter", "removeHeader error, header is null");
            label187: this.mPi.setText(this.mPr);
          }
        }
        while (true)
        {
          this.mPj.mOH.clear();
          wu(this.mPj.mOI.size());
          this.mPj.notifyDataSetChanged();
          if (this.ehJ != null)
            this.ehJ.dismiss();
          getString(2131297061);
          this.ehJ = h.b(this, getString(2131297086), true, new AlbumPreviewUI.12(this));
          start = System.currentTimeMillis();
          localObject1 = this.mPr;
          if (paramAlbumItem.mOh != null)
            break label356;
          AppMethodBeat.o(21425);
          break;
          ((a)localObject1).mOM.remove(localObject2);
          break label187;
          if (getIntent().getBooleanExtra("show_header_view", true))
            this.mPj.a(this.mPL);
          updateTitle();
          this.mPs = com.tencent.mm.plugin.gallery.model.e.bBZ().mOu;
        }
        label356: int i = paramAlbumItem.mOh.getType();
        int j = com.tencent.mm.plugin.gallery.model.e.bBZ().mOu;
        ab.i("MicroMsg.AlbumPreviewUI", "folder type[%d] queryType[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        Object localObject2 = localObject1;
        if (j != 2)
        {
          localObject2 = localObject1;
          if (paramAlbumItem.mOh.getType() == 2)
            localObject2 = "";
        }
        if (bo.isNullOrNil(paramAlbumItem.mOg))
          i = 3;
        this.mPK = System.currentTimeMillis();
        com.tencent.mm.plugin.gallery.model.e.bBZ().g((String)localObject2, i, this.mPK);
        AppMethodBeat.o(21425);
      }
    }
  }

  private boolean a(GalleryItem.MediaItem paramMediaItem)
  {
    boolean bool = false;
    AppMethodBeat.i(21436);
    if (paramMediaItem == null)
    {
      ab.e("MicroMsg.AlbumPreviewUI", "[checkSelectedVideo] item is null!");
      AppMethodBeat.o(21436);
    }
    while (true)
    {
      return bool;
      if (this.mOG == null)
      {
        ab.e("MicroMsg.AlbumPreviewUI", "[checkSelectedVideo] invoker is null!");
        AppMethodBeat.o(21436);
      }
      else if (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ == 3)
      {
        if (!new File(paramMediaItem.fPT).exists())
        {
          h.bP(this, getString(2131300201));
          AppMethodBeat.o(21436);
        }
        else
        {
          try
          {
            if (this.mOG.ND(paramMediaItem.fPT) > 300)
            {
              h.bP(this, getString(2131300203));
              AppMethodBeat.o(21436);
            }
          }
          catch (RemoteException paramMediaItem)
          {
            ab.printErrStackTrace("MicroMsg.AlbumPreviewUI", paramMediaItem, "", new Object[0]);
            AppMethodBeat.o(21436);
            bool = true;
          }
        }
      }
      else
      {
        AppMethodBeat.o(21436);
        bool = true;
      }
    }
  }

  private void bCA()
  {
    AppMethodBeat.i(21434);
    if (!this.mPM)
      AppMethodBeat.o(21434);
    while (true)
    {
      return;
      SharedPreferences localSharedPreferences = getSharedPreferences("gallery_last_choose_album", 0);
      ab.i("MicroMsg.AlbumPreviewUI", "last selected folderName and path: " + this.mPr + ", " + this.mPq);
      localSharedPreferences.edit().putString(com.tencent.mm.plugin.gallery.model.e.bBZ().mOu, this.mPr + "|" + this.mPq + "|" + this.mPs).commit();
      AppMethodBeat.o(21434);
    }
  }

  private void bCz()
  {
    AppMethodBeat.i(21428);
    if (!n.c(this.mController.ylL, com.tencent.mm.compatible.util.e.euR, "microMsg." + System.currentTimeMillis() + ".jpg", 4369))
    {
      Toast.makeText(this.mController.ylL, getString(2131302908), 1).show();
      AppMethodBeat.o(21428);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.gallery.model.e.bCa().wp(0);
      System.gc();
      AppMethodBeat.o(21428);
    }
  }

  private void updateTitle()
  {
    AppMethodBeat.i(21423);
    if (com.tencent.mm.plugin.gallery.model.e.bBZ().mOu == 3)
    {
      setMMTitle(2131300167);
      this.mPi.setText(2131300167);
      AppMethodBeat.o(21423);
    }
    while (true)
    {
      return;
      if (com.tencent.mm.plugin.gallery.model.e.bBZ().mOu == 1)
      {
        setMMTitle(2131300208);
        this.mPi.setText(2131300166);
        AppMethodBeat.o(21423);
      }
      else
      {
        setMMTitle(2131300168);
        this.mPi.setText(2131300168);
        AppMethodBeat.o(21423);
      }
    }
  }

  private void wu(int paramInt)
  {
    AppMethodBeat.i(21431);
    if (paramInt == 0)
    {
      this.mPf.setEnabled(false);
      enableOptionMenu(false);
      if (paramInt != 0)
        break label70;
      this.mPf.setText(2131300183);
    }
    while (true)
    {
      updateOptionMenuText(0, wv(paramInt));
      AppMethodBeat.o(21431);
      return;
      this.mPf.setEnabled(true);
      enableOptionMenu(true);
      break;
      label70: this.mPf.setText(getString(2131300183) + "(" + paramInt + ")");
    }
  }

  private String wv(int paramInt)
  {
    AppMethodBeat.i(21432);
    String str;
    switch (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ)
    {
    default:
      if ((paramInt == 0) || (this.mPA <= 1))
      {
        str = getString(2131297041);
        AppMethodBeat.o(21432);
      }
      break;
    case 4:
    case 8:
    case 13:
    case 7:
    }
    while (true)
    {
      return str;
      if ((paramInt == 0) || (this.mPA <= 1))
      {
        str = getString(2131300184);
        AppMethodBeat.o(21432);
      }
      else
      {
        str = getString(2131300184) + "(" + paramInt + "/" + this.mPA + ")";
        AppMethodBeat.o(21432);
        continue;
        if ((!bo.isNullOrNil(this.mOL)) && (this.mOL.equals("album_business_bubble_media_by_coordinate")))
        {
          if ((paramInt == 0) || (this.mPA <= 1))
          {
            str = getString(2131296989);
            AppMethodBeat.o(21432);
          }
          else
          {
            str = getString(2131296989) + "(" + paramInt + "/" + this.mPA + ")";
            AppMethodBeat.o(21432);
          }
        }
        else if ((paramInt == 0) || (this.mPA <= 1))
        {
          str = getString(2131300184);
          AppMethodBeat.o(21432);
        }
        else
        {
          str = getString(2131300184) + "(" + paramInt + "/" + this.mPA + ")";
          AppMethodBeat.o(21432);
          continue;
          str = getString(2131300176, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.mPA) });
          AppMethodBeat.o(21432);
        }
      }
    }
  }

  public final void V(int paramInt, boolean paramBoolean)
  {
    boolean bool1 = true;
    AppMethodBeat.i(21426);
    switch (com.tencent.mm.plugin.gallery.model.e.bBZ().mOu)
    {
    default:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(21426);
      while (true)
      {
        return;
        if ((!bo.isNullOrNil(this.cEV)) && (!"medianote".equals(this.toUser)))
        {
          if (bo.yz() - this.mPF < 1000L)
          {
            ab.w("MicroMsg.AlbumPreviewUI", "sendimg btn event frequence limit");
            AppMethodBeat.o(21426);
          }
        }
        else
        {
          break;
          ab.i("MicroMsg.AlbumPreviewUI", "switch to SendImgProxyUI");
          Object localObject = (GalleryItem.MediaItem)this.mPj.mOH.get(paramInt);
          if (((GalleryItem.MediaItem)localObject).getType() == 2)
            break;
          try
          {
            com.tencent.mm.plugin.gallery.stub.a locala = this.mOG;
            String str = ((GalleryItem.MediaItem)localObject).fPT;
            localObject = this.toUser;
            if (this.mPu);
            while (true)
            {
              locala.a(str, (String)localObject, bool1, 0, paramBoolean);
              AppMethodBeat.o(21426);
              break;
              boolean bool2 = this.kvs;
              if (bool2)
                bool1 = false;
            }
          }
          catch (Exception localException)
          {
          }
        }
      }
    }
  }

  public final void c(LinkedList<GalleryItem.MediaItem> paramLinkedList, long paramLong)
  {
    boolean bool = true;
    AppMethodBeat.i(21433);
    if (paramLong != this.mPK)
    {
      ab.w("MicroMsg.AlbumPreviewUI", "%s %s, not my query, ignore.", new Object[] { Long.valueOf(paramLong), Long.valueOf(this.mPK) });
      ab.w("MicroMsg.AlbumPreviewUI", "If you saw too mush this log, maybe user had too many photos. This can be optimized.");
      AppMethodBeat.o(21433);
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    if (paramLinkedList != null)
      localLinkedList.addAll(paramLinkedList);
    if (this.mPj == null);
    while (true)
    {
      ab.i("MicroMsg.AlbumPreviewUI", "[onQueryMediaFinished] adapter is null?:%s", new Object[] { Boolean.valueOf(bool) });
      if (this.mPj != null)
      {
        paramLinkedList = new AlbumPreviewUI.a((byte)0);
        paramLinkedList.mPW = new WeakReference(this.mPj);
        paramLinkedList.mPX = new WeakReference(this.ehJ);
        paramLinkedList.mPY = new WeakReference(this.mPl);
        paramLinkedList.mPZ = new WeakReference(this.mPe);
        paramLinkedList.mQa = localLinkedList;
        paramLinkedList.mQb = new WeakReference(this.mPI);
        com.tencent.mm.plugin.gallery.model.e.bCa().d(paramLinkedList);
      }
      AppMethodBeat.o(21433);
      break;
      bool = false;
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130970554;
  }

  public final void initView()
  {
    AppMethodBeat.i(21427);
    Object localObject1 = getIntent().getExtras();
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = ((Bundle)localObject1).keySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        String str = (String)((Iterator)localObject2).next();
        ab.d("MicroMsg.AlbumPreviewUI", "key=%s | value=%s", new Object[] { str, ((Bundle)localObject1).get(str) });
      }
    }
    ab.e("MicroMsg.AlbumPreviewUI", "initView, oops! no extras data!");
    this.mOL = getIntent().getStringExtra("album_business_tag");
    this.gLP = getIntent().getIntExtra("album_video_max_duration", 10);
    this.cEV = getIntent().getStringExtra("GalleryUI_FromUser");
    this.toUser = getIntent().getStringExtra("GalleryUI_ToUser");
    this.mPA = getIntent().getIntExtra("max_select_count", 9);
    boolean bool;
    if (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ == 4)
    {
      bool = true;
      this.mPu = bool;
      if (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ != 5)
        break label1111;
      bool = true;
      label188: this.mPw = bool;
      if (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ != 9)
        break label1117;
      bool = true;
      label208: this.mPx = bool;
      this.mPq = getIntent().getStringExtra("folder_path");
      this.mPr = getIntent().getStringExtra("folder_name");
      if (bo.isNullOrNil(this.mPq))
      {
        ab.e("MicroMsg.AlbumPreviewUI", "get folder path failed");
        this.mPq = this.mPr;
      }
      this.kvs = getIntent().getBooleanExtra("key_send_raw_image", false);
      this.mPy = getIntent().getBooleanExtra("key_can_select_video_and_pic", false);
      this.mPo = ((TextView)findViewById(2131822756));
      this.mPp = ((ImageButton)findViewById(2131822755));
      this.mPo.setOnClickListener(new AlbumPreviewUI.13(this));
      if (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ != 3)
        break label1123;
      this.mPp.setVisibility(0);
      this.mPo.setVisibility(0);
      label367: if (!this.kvs)
        break label1144;
      this.mPp.setImageResource(2131231853);
      label384: this.mPp.setOnClickListener(new AlbumPreviewUI.14(this));
      this.mPk = ((TextView)findViewById(2131823946));
      this.mPl = ((TextView)findViewById(2131827230));
      this.mPm = ((TextView)findViewById(2131827231));
      this.mPf = ((TextView)findViewById(2131827236));
      if ((com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ != 0) && (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ != 5) && (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ != 10) && (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ != 11) && (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ != 14))
        break label1157;
      findViewById(2131827235).setVisibility(8);
      this.mPf.setVisibility(8);
    }
    while (true)
    {
      this.mPn = ((ImageFolderMgrView)findViewById(2131827237));
      localObject1 = this.mPn;
      com.tencent.mm.plugin.gallery.model.e.bBZ().b((i.a)localObject1);
      com.tencent.mm.plugin.gallery.model.e.bBZ().a((i.a)localObject1);
      com.tencent.mm.plugin.gallery.model.e.bBZ().bCu();
      this.mPn.setListener(new AlbumPreviewUI.17(this));
      this.mPt = getIntent().getStringExtra("send_btn_string");
      findViewById(2131827233).setOnClickListener(new AlbumPreviewUI.18(this));
      this.mPi = ((TextView)findViewById(2131827234));
      if (this.mPw)
        showOptionMenu(false);
      enableOptionMenu(false);
      this.mPe = ((GridView)findViewById(2131827229));
      this.mPe.setOnItemClickListener(new AlbumPreviewUI.2(this));
      this.mPj = new a(this, new AlbumPreviewUI.3(this));
      if (!bo.isNullOrNil(this.mOL))
      {
        ab.d("MicroMsg.AlbumPreviewUI", "businessTag=%s", new Object[] { this.mOL });
        this.mPj.mOL = this.mOL;
        this.mPj.gLP = this.gLP;
        if (this.mOL.equals("album_business_bubble_media_by_coordinate"))
        {
          com.tencent.mm.plugin.gallery.model.e.bBZ().mOt.bBV();
          this.mPI = getIntent().getStringExtra("album_business_bubble_media_by_coordinate_posname");
          double d = getIntent().getDoubleExtra("album_business_bubble_media_by_coordinate_distance", -1.0D);
          this.longitude = getIntent().getDoubleExtra("album_business_bubble_media_by_coordinate_longitude", 91.0D);
          this.latitude = getIntent().getDoubleExtra("album_business_bubble_media_by_coordinate_latitude", 181.0D);
          if ((d > 0.0D) && (com.tencent.mm.modelgeo.a.q(this.longitude)) && (com.tencent.mm.modelgeo.a.r(this.latitude)))
          {
            this.mPJ = new AlbumPreviewUI.4(this, d);
            localObject2 = com.tencent.mm.plugin.gallery.model.e.bBZ();
            localObject1 = this.mPJ;
            if (localObject1 != null)
              ((l)localObject2).mOs.add(localObject1);
            this.mPj.mON = false;
          }
        }
      }
      if (this.mPu)
        this.mPj.mON = true;
      if (this.mPy)
        this.mPj.mON = true;
      this.mPe.setNumColumns(4);
      this.mPe.setOnScrollListener(new AlbumPreviewUI.5(this));
      if (getIntent().getBooleanExtra("show_header_view", true))
        this.mPj.a(this.mPL);
      this.mPj.mOK = com.tencent.mm.plugin.gallery.model.e.bBZ().mOu;
      this.mPj.mOF = this.mPA;
      ab.i("MicroMsg.AlbumPreviewUI", "limit count = " + getIntent().getIntExtra("max_select_count", 9));
      this.mPe.setAdapter(this.mPj);
      updateTitle();
      setBackBtn(new AlbumPreviewUI.6(this));
      localObject1 = (ViewGroup)findViewById(2131820987);
      if ((localObject1 instanceof DrawedCallBackFrameLayout))
        ((DrawedCallBackFrameLayout)localObject1).setListener(new AlbumPreviewUI.7(this));
      AppMethodBeat.o(21427);
      return;
      bool = false;
      break;
      label1111: bool = false;
      break label188;
      label1117: bool = false;
      break label208;
      label1123: this.mPp.setVisibility(8);
      this.mPo.setVisibility(8);
      break label367;
      label1144: this.mPp.setImageResource(2131231852);
      break label384;
      label1157: this.mPf.setVisibility(0);
      this.mPf.setOnClickListener(new AlbumPreviewUI.15(this));
      if (((com.tencent.mm.plugin.gallery.model.e.bBZ().mOu == 1) || (com.tencent.mm.plugin.gallery.model.e.bBZ().mOu == 2) || (com.tencent.mm.plugin.gallery.model.e.bBZ().mOu == 3)) && (this.mPA > 0))
      {
        localObject1 = new AlbumPreviewUI.16(this);
        if (!bo.isNullOrNil(this.mPt))
          addTextOptionMenu(0, this.mPt, (MenuItem.OnMenuItemClickListener)localObject1);
        else if (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ != 14)
          a(0, wv(0), (MenuItem.OnMenuItemClickListener)localObject1, q.b.ymu);
      }
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(21430);
    ab.i("MicroMsg.AlbumPreviewUI", "on activity result, requestCode[%d] resultCode[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    Object localObject1;
    Object localObject2;
    if (4369 == paramInt1)
    {
      if (-1 != paramInt2)
        AppMethodBeat.o(21430);
      while (true)
      {
        return;
        localObject1 = n.h(this.mController.ylL.getApplicationContext(), paramIntent, com.tencent.mm.compatible.util.e.euR);
        if (!bo.isNullOrNil((String)localObject1))
          break;
        ab.w("MicroMsg.AlbumPreviewUI", "take photo, but result is null");
        AppMethodBeat.o(21430);
      }
      ab.i("MicroMsg.AlbumPreviewUI", "take photo, result[%s]", new Object[] { localObject1 });
      if ((com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ == 0) || (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ == 5) || (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ == 11))
      {
        localObject2 = new Intent();
        ((Intent)localObject2).setData(Uri.parse("file://" + Uri.encode((String)localObject1)));
        ab.i("MicroMsg.AlbumPreviewUI", "take photo finish");
        setResult(-1, (Intent)localObject2);
        finish();
        localObject1 = paramIntent;
      }
    }
    while (true)
    {
      if ((localObject1 != null) && (((Intent)localObject1).getBooleanExtra("show_photo_edit_tip", false)))
      {
        paramIntent = getSharedPreferences("photo_edit_pref", 0);
        if (!paramIntent.getBoolean("has_show_tip", false))
        {
          this.mPm.setVisibility(0);
          this.mPm.setText(getString(2131301947));
          localObject1 = AnimationUtils.loadAnimation(this.mController.ylL, 2131034180);
          this.mPm.startAnimation((Animation)localObject1);
          ((Animation)localObject1).setAnimationListener(new AlbumPreviewUI.9(this));
          paramIntent.edit().putBoolean("has_show_tip", true).commit();
        }
      }
      AppMethodBeat.o(21430);
      break;
      localObject2 = new ArrayList(1);
      ((ArrayList)localObject2).add(localObject1);
      localObject1 = new Intent(this, ImagePreviewUI.class);
      ((Intent)localObject1).putExtra("isTakePhoto", true);
      ((Intent)localObject1).putExtra("max_select_count", 1);
      ((Intent)localObject1).putExtra("send_raw_img", this.kvs);
      ((Intent)localObject1).putStringArrayListExtra("preview_image_list", (ArrayList)localObject2);
      ((Intent)localObject1).putExtra("GalleryUI_FromUser", this.cEV);
      ((Intent)localObject1).putExtra("GalleryUI_ToUser", this.toUser);
      startActivityForResult((Intent)localObject1, 4370);
      localObject1 = paramIntent;
      continue;
      if (4370 == paramInt1)
      {
        if (-1 != paramInt2)
        {
          AppMethodBeat.o(21430);
          break;
        }
        if (paramIntent.getBooleanExtra("GalleryUI_IsSendImgBackground", false))
        {
          ab.i("MicroMsg.AlbumPreviewUI", "test onActivityResult");
          setResult(-1, paramIntent);
          finish();
          AppMethodBeat.o(21430);
          break;
        }
        localObject1 = paramIntent.getStringArrayListExtra("CropImage_OutputPath_List");
        if ((localObject1 == null) || (((ArrayList)localObject1).isEmpty()))
        {
          ab.w("MicroMsg.AlbumPreviewUI", "send filepath is null or nil");
          AppMethodBeat.o(21430);
          break;
        }
        ab.i("MicroMsg.AlbumPreviewUI", "gallery photo:%s", new Object[] { localObject1 });
        setResult(-1, paramIntent);
        finish();
        localObject1 = paramIntent;
        continue;
      }
      if (4371 == paramInt1)
      {
        if (-1 != paramInt2)
        {
          AppMethodBeat.o(21430);
          break;
        }
        if (paramIntent != null)
          paramIntent.putExtra("from_record", true);
        ab.i("MicroMsg.AlbumPreviewUI", "custom record video, result[%s]", new Object[] { paramIntent });
        setResult(-1, paramIntent);
        finish();
        localObject1 = paramIntent;
        continue;
      }
      if (4372 == paramInt1)
      {
        if (-1 != paramInt2)
        {
          AppMethodBeat.o(21430);
          break;
        }
        localObject1 = paramIntent;
        if (paramIntent == null)
          localObject1 = new Intent();
        ab.i("MicroMsg.AlbumPreviewUI", "system record video, result[%s]", new Object[] { localObject1 });
        paramIntent = new ArrayList();
        localObject2 = getIntent().getStringExtra("video_full_path");
        if (!bo.isNullOrNil((String)localObject2))
        {
          paramIntent.add(localObject2);
          ((Intent)localObject1).putExtra("key_select_video_list", paramIntent);
          ((Intent)localObject1).putExtra("key_selected_video_is_from_sys_camera", true);
        }
        setResult(-1, (Intent)localObject1);
        finish();
        continue;
      }
      if (4373 == paramInt1)
      {
        if (paramIntent != null)
        {
          paramIntent.putExtra("GalleryUI_IsSendImgBackground", true);
          ab.e("MicroMsg.AlbumPreviewUI", "send img background, data is null!!");
        }
        ab.i("MicroMsg.AlbumPreviewUI", "Request code sendimg proxy");
        setResult(-1, paramIntent);
        this.mPC = true;
        finish();
        localObject1 = paramIntent;
      }
      else
      {
        if (4375 == paramInt1)
        {
          if (-1 != paramInt2)
          {
            AppMethodBeat.o(21430);
            break;
          }
          localObject1 = paramIntent;
          if (paramIntent == null)
            localObject1 = new Intent();
          ab.i("MicroMsg.AlbumPreviewUI", "sight capture record video, result[%s]", new Object[] { localObject1 });
          paramIntent = (SightCaptureResult)((Intent)localObject1).getParcelableExtra("key_req_result");
          if (paramIntent == null)
          {
            ab.e("MicroMsg.AlbumPreviewUI", "sight capture result is null!");
            setResult(1);
            finish();
            AppMethodBeat.o(21430);
            break;
          }
          localObject2 = new ArrayList();
          String str = paramIntent.osC;
          if (!bo.isNullOrNil(str))
          {
            ((ArrayList)localObject2).add(str);
            ((Intent)localObject1).putExtra("key_select_video_list", (Serializable)localObject2);
          }
          if ((paramIntent.osA) && (!bo.isNullOrNil(paramIntent.osI)))
          {
            localObject2 = new ArrayList();
            ((ArrayList)localObject2).add(paramIntent.osI);
            ((Intent)localObject1).putStringArrayListExtra("CropImage_OutputPath_List", (ArrayList)localObject2);
          }
          setResult(-1, (Intent)localObject1);
          finish();
          continue;
        }
        if (4376 == paramInt1)
        {
          if (-1 != paramInt2)
          {
            ab.i("MicroMsg.AlbumPreviewUI", "REQUEST_SELECT_FOLDER goBack!");
            finish();
            localObject1 = paramIntent;
          }
          else
          {
            localObject1 = paramIntent;
            if (paramIntent != null)
            {
              localObject1 = (GalleryItem.AlbumItem)paramIntent.getParcelableExtra("select_folder_name");
              a((GalleryItem.AlbumItem)localObject1);
              setMMTitle(bo.bc(((GalleryItem.AlbumItem)localObject1).mOg, getString(2131300167)));
              localObject1 = paramIntent;
            }
          }
        }
        else
          switch (paramInt2)
          {
          default:
            localObject1 = paramIntent;
            break;
          case -2:
            ab.e("MicroMsg.AlbumPreviewUI", "WTF!!!");
            finish();
            localObject1 = paramIntent;
            break;
          case -1:
            localObject1 = paramIntent;
            if (paramIntent == null)
            {
              localObject1 = new Intent();
              ((Intent)localObject1).putExtra("CropImage_Compress_Img", true);
              ((Intent)localObject1).putStringArrayListExtra("CropImage_OutputPath_List", this.mPj.bCw());
            }
            ab.i("MicroMsg.AlbumPreviewUI", "onActivity Result ok");
            this.mPh = true;
            setResult(-1, (Intent)localObject1);
            bCA();
            finish();
            break;
          case 0:
            localObject1 = paramIntent;
            if (paramIntent != null)
            {
              localObject1 = paramIntent.getStringArrayListExtra("preview_image_list");
              if (localObject1 != null)
              {
                this.mPj.C((ArrayList)localObject1);
                this.mPj.notifyDataSetChanged();
                wu(((ArrayList)localObject1).size());
              }
              if (!paramIntent.getBooleanExtra("CropImage_Compress_Img", true));
              for (boolean bool = true; ; bool = false)
              {
                this.kvs = bool;
                if (!this.kvs)
                  break label1324;
                this.mPp.setImageResource(2131231853);
                localObject1 = paramIntent;
                break;
              }
              label1324: this.mPp.setImageResource(2131231852);
              localObject1 = paramIntent;
            }
            break;
          }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(21418);
    super.onCreate(paramBundle);
    this.mPG = System.currentTimeMillis();
    ab.i("MicroMsg.AlbumPreviewUI", "onCreate");
    if (paramBundle != null)
    {
      ab.i("MicroMsg.AlbumPreviewUI", "savedInstanceState not null");
      this.mPB = paramBundle.getInt("constants_key");
      com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ = this.mPB;
    }
    Nb(this.mController.ylL.getResources().getColor(2131689913));
    getString(2131297061);
    this.ehJ = h.b(this, getString(2131297086), true, new AlbumPreviewUI.11(this));
    start = System.currentTimeMillis();
    int i = getIntent().getIntExtra("query_source_type", 3);
    int j = getIntent().getIntExtra("query_media_type", 1);
    ab.i("MicroMsg.AlbumPreviewUI", "query souce: " + i + ", queryType: " + j);
    com.tencent.mm.plugin.gallery.model.e.bBZ().wq(j);
    com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ = i;
    initView();
    com.tencent.mm.plugin.gallery.model.e.bBZ().mOr.add(this);
    this.mPK = System.currentTimeMillis();
    paramBundle = com.tencent.mm.plugin.gallery.model.e.bBZ();
    String str = this.mPr;
    long l = this.mPK;
    paramBundle.g(str, paramBundle.mOu, l);
    bindService(new Intent(this.mController.ylL, GalleryStubService.class), this.ktl, 1);
    o.JV(1);
    AppMethodBeat.o(21418);
  }

  // ERROR //
  public void onDestroy()
  {
    // Byte code:
    //   0: sipush 21421
    //   3: invokestatic 90	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokespecial 1258	com/tencent/mm/ui/MMActivity:onDestroy	()V
    //   10: ldc 225
    //   12: ldc_w 1259
    //   15: invokestatic 525	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   18: aload_0
    //   19: getfield 692	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:mPn	Lcom/tencent/mm/plugin/gallery/ui/ImageFolderMgrView;
    //   22: astore_1
    //   23: invokestatic 436	com/tencent/mm/plugin/gallery/model/e:bBZ	()Lcom/tencent/mm/plugin/gallery/model/l;
    //   26: aload_1
    //   27: invokevirtual 852	com/tencent/mm/plugin/gallery/model/l:b	(Lcom/tencent/mm/plugin/gallery/model/i$a;)V
    //   30: invokestatic 589	com/tencent/mm/plugin/gallery/model/e:bCa	()Lcom/tencent/mm/plugin/gallery/model/g;
    //   33: invokevirtual 1262	com/tencent/mm/plugin/gallery/model/g:bCp	()V
    //   36: invokestatic 589	com/tencent/mm/plugin/gallery/model/e:bCa	()Lcom/tencent/mm/plugin/gallery/model/g;
    //   39: invokevirtual 1266	com/tencent/mm/plugin/gallery/model/g:bCo	()Lcom/tencent/mm/sdk/platformtools/ak;
    //   42: aconst_null
    //   43: invokevirtual 1271	com/tencent/mm/sdk/platformtools/ak:removeCallbacksAndMessages	(Ljava/lang/Object;)V
    //   46: invokestatic 436	com/tencent/mm/plugin/gallery/model/e:bBZ	()Lcom/tencent/mm/plugin/gallery/model/l;
    //   49: getfield 1242	com/tencent/mm/plugin/gallery/model/l:mOr	Ljava/util/HashSet;
    //   52: aload_0
    //   53: invokevirtual 1272	java/util/HashSet:remove	(Ljava/lang/Object;)Z
    //   56: pop
    //   57: invokestatic 436	com/tencent/mm/plugin/gallery/model/e:bBZ	()Lcom/tencent/mm/plugin/gallery/model/l;
    //   60: astore_1
    //   61: aload_0
    //   62: getfield 938	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:mPJ	Lcom/tencent/mm/plugin/gallery/model/i$b;
    //   65: astore_2
    //   66: aload_2
    //   67: ifnull +12 -> 79
    //   70: aload_1
    //   71: getfield 942	com/tencent/mm/plugin/gallery/model/l:mOs	Ljava/util/HashSet;
    //   74: aload_2
    //   75: invokevirtual 1272	java/util/HashSet:remove	(Ljava/lang/Object;)Z
    //   78: pop
    //   79: aload_0
    //   80: getfield 108	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:mPD	I
    //   83: ifgt +10 -> 93
    //   86: aload_0
    //   87: getfield 110	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:mPE	I
    //   90: ifle +267 -> 357
    //   93: ldc 225
    //   95: ldc_w 1274
    //   98: iconst_2
    //   99: anewarray 243	java/lang/Object
    //   102: dup
    //   103: iconst_0
    //   104: aload_0
    //   105: getfield 108	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:mPD	I
    //   108: invokestatic 252	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   111: aastore
    //   112: dup
    //   113: iconst_1
    //   114: aload_0
    //   115: getfield 110	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:mPE	I
    //   118: invokestatic 252	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   121: aastore
    //   122: invokestatic 281	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   125: aload_0
    //   126: getfield 112	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:mOG	Lcom/tencent/mm/plugin/gallery/stub/a;
    //   129: astore_1
    //   130: new 511	java/lang/StringBuilder
    //   133: astore_2
    //   134: aload_2
    //   135: invokespecial 532	java/lang/StringBuilder:<init>	()V
    //   138: aload_1
    //   139: sipush 11187
    //   142: aload_2
    //   143: aload_0
    //   144: getfield 108	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:mPD	I
    //   147: invokevirtual 535	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   150: ldc_w 1276
    //   153: invokevirtual 518	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: aload_0
    //   157: getfield 110	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:mPE	I
    //   160: invokevirtual 535	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   163: invokevirtual 523	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   166: invokeinterface 1279 3 0
    //   171: aload_0
    //   172: getfield 114	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:mPF	J
    //   175: lconst_0
    //   176: lcmp
    //   177: ifgt +10 -> 187
    //   180: aload_0
    //   181: getfield 1190	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:mPh	Z
    //   184: ifeq +32 -> 216
    //   187: aload_0
    //   188: getfield 112	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:mOG	Lcom/tencent/mm/plugin/gallery/stub/a;
    //   191: aload_0
    //   192: getfield 868	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:mPt	Ljava/lang/String;
    //   195: aload_0
    //   196: getfield 311	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:mPj	Lcom/tencent/mm/plugin/gallery/ui/a;
    //   199: getfield 340	com/tencent/mm/plugin/gallery/ui/a:mOI	Ljava/util/ArrayList;
    //   202: invokestatic 1281	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:D	(Ljava/util/ArrayList;)[I
    //   205: aload_0
    //   206: getfield 100	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:kvs	Z
    //   209: aload_0
    //   210: getfield 613	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:mPg	Z
    //   213: invokestatic 1284	com/tencent/mm/plugin/gallery/model/e:a	(Lcom/tencent/mm/plugin/gallery/stub/a;Ljava/lang/String;[IZZ)V
    //   216: aload_0
    //   217: getfield 112	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:mOG	Lcom/tencent/mm/plugin/gallery/stub/a;
    //   220: astore_1
    //   221: aload_0
    //   222: getfield 311	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:mPj	Lcom/tencent/mm/plugin/gallery/ui/a;
    //   225: getfield 340	com/tencent/mm/plugin/gallery/ui/a:mOI	Ljava/util/ArrayList;
    //   228: invokevirtual 162	java/util/ArrayList:size	()I
    //   231: istore_3
    //   232: aload_0
    //   233: getfield 100	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:kvs	Z
    //   236: istore 4
    //   238: aload_0
    //   239: getfield 114	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:mPF	J
    //   242: lconst_0
    //   243: lcmp
    //   244: ifgt +10 -> 254
    //   247: aload_0
    //   248: getfield 1190	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:mPh	Z
    //   251: ifeq +117 -> 368
    //   254: iconst_1
    //   255: istore 5
    //   257: aload_1
    //   258: iload_3
    //   259: iload 4
    //   261: iload 5
    //   263: invokestatic 1287	com/tencent/mm/plugin/gallery/model/e:a	(Lcom/tencent/mm/plugin/gallery/stub/a;IZZ)V
    //   266: getstatic 1293	com/tencent/mm/api/s:ccQ	Lcom/tencent/mm/api/s$b;
    //   269: invokeinterface 1299 1 0
    //   274: invokevirtual 1302	com/tencent/mm/api/s:Ad	()V
    //   277: invokestatic 263	com/tencent/mm/plugin/gallery/model/e:bCc	()Ljava/util/HashSet;
    //   280: invokevirtual 1303	java/util/HashSet:clear	()V
    //   283: invokestatic 1306	com/tencent/mm/plugin/gallery/model/e:bCd	()Ljava/util/ArrayList;
    //   286: invokevirtual 380	java/util/ArrayList:clear	()V
    //   289: invokestatic 334	com/tencent/mm/plugin/gallery/model/e:bCe	()Ljava/util/LinkedHashSet;
    //   292: invokevirtual 1307	java/util/LinkedHashSet:clear	()V
    //   295: aload_0
    //   296: aload_0
    //   297: getfield 123	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:ktl	Landroid/content/ServiceConnection;
    //   300: invokevirtual 1311	com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI:unbindService	(Landroid/content/ServiceConnection;)V
    //   303: iconst_2
    //   304: invokestatic 1253	com/tencent/mm/plugin/webview/ui/tools/widget/o:JV	(I)V
    //   307: invokestatic 1315	com/tencent/mm/plugin/gallery/model/e:bBY	()Lcom/tencent/mm/plugin/gallery/model/c;
    //   310: aconst_null
    //   311: invokevirtual 1320	com/tencent/mm/plugin/gallery/model/c:b	(Lcom/tencent/mm/plugin/gallery/model/d$b;)V
    //   314: sipush 21421
    //   317: invokestatic 142	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   320: return
    //   321: astore_1
    //   322: ldc 225
    //   324: ldc_w 1322
    //   327: iconst_1
    //   328: anewarray 243	java/lang/Object
    //   331: dup
    //   332: iconst_0
    //   333: aload_1
    //   334: invokevirtual 1325	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   337: aastore
    //   338: invokestatic 1327	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   341: ldc 225
    //   343: aload_1
    //   344: ldc_w 316
    //   347: iconst_0
    //   348: anewarray 243	java/lang/Object
    //   351: invokestatic 496	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   354: goto -183 -> 171
    //   357: ldc 225
    //   359: ldc_w 1329
    //   362: invokestatic 330	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   365: goto -194 -> 171
    //   368: iconst_0
    //   369: istore 5
    //   371: goto -114 -> 257
    //   374: astore_1
    //   375: ldc 225
    //   377: aload_1
    //   378: ldc_w 316
    //   381: iconst_0
    //   382: anewarray 243	java/lang/Object
    //   385: invokestatic 496	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   388: goto -122 -> 266
    //   391: astore_1
    //   392: ldc 225
    //   394: aload_1
    //   395: ldc_w 1331
    //   398: iconst_0
    //   399: anewarray 243	java/lang/Object
    //   402: invokestatic 496	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   405: goto -102 -> 303
    //
    // Exception table:
    //   from	to	target	type
    //   125	171	321	java/lang/Exception
    //   171	187	374	android/os/RemoteException
    //   187	216	374	android/os/RemoteException
    //   216	254	374	android/os/RemoteException
    //   257	266	374	android/os/RemoteException
    //   295	303	391	java/lang/Throwable
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(21429);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      ab.i("MicroMsg.AlbumPreviewUI", "onKeyDown");
      setResult(-2);
      if (this.mPn.aej)
      {
        this.mPn.bCE();
        AppMethodBeat.o(21429);
      }
    }
    while (true)
    {
      return bool;
      finish();
      AppMethodBeat.o(21429);
      continue;
      if (paramInt == 82)
      {
        this.mPE += 1;
        this.mPn.bCE();
        AppMethodBeat.o(21429);
      }
      else
      {
        bool = super.onKeyDown(paramInt, paramKeyEvent);
        AppMethodBeat.o(21429);
      }
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(21419);
    super.onPause();
    ab.i("MicroMsg.AlbumPreviewUI", "on resume");
    this.mPz = true;
    ab.d("MicroMsg.AlbumPreviewUI", "shouldSaveLastChoosePath: " + this.mPv);
    if (this.mPv)
      bCA();
    ImageFolderMgrView localImageFolderMgrView;
    if (this.mPn.aej)
    {
      localImageFolderMgrView = this.mPn;
      if (localImageFolderMgrView.aej)
        break label113;
      ab.w("MicroMsg.ImageFolderMgrView", "want to close, but it was closed");
    }
    while (true)
    {
      WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcAlbumScrollEnable, this.ehv);
      this.ehv = 0;
      AppMethodBeat.o(21419);
      return;
      label113: if (localImageFolderMgrView.mQE)
      {
        ab.d("MicroMsg.ImageFolderMgrView", "want to close, but it is in animation");
      }
      else
      {
        localImageFolderMgrView.mQA.setVisibility(8);
        localImageFolderMgrView.aej = false;
      }
    }
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(21435);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.AlbumPreviewUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(21435);
      return;
    }
    ab.i("MicroMsg.AlbumPreviewUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 16:
    }
    while (true)
    {
      AppMethodBeat.o(21435);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        bCz();
        AppMethodBeat.o(21435);
        break;
      }
      h.a(this, getString(2131301920), getString(2131301936), getString(2131300878), getString(2131297773), false, new AlbumPreviewUI.10(this), null);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(21420);
    super.onResume();
    ab.i("MicroMsg.AlbumPreviewUI", "on resume");
    this.mPz = false;
    AppMethodBeat.o(21420);
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    AppMethodBeat.i(21422);
    this.mPB = com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ;
    paramBundle.putInt("constants_key", this.mPB);
    AppMethodBeat.o(21422);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI
 * JD-Core Version:    0.6.2
 */