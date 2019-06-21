package com.tencent.mm.plugin.gallery.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.b.d;
import com.tencent.mm.plugin.gallery.model.GalleryItem.ImageMediaItem;
import com.tencent.mm.plugin.gallery.model.GalleryItem.MediaItem;
import com.tencent.mm.plugin.gallery.model.GalleryItem.VideoMediaItem;
import com.tencent.mm.plugin.gallery.model.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public final class a extends BaseAdapter
  implements com.tencent.mm.ui.gridviewheaders.e
{
  int gLP;
  private SimpleDateFormat kIy;
  private Context mContext;
  int mOF;
  com.tencent.mm.plugin.gallery.stub.a mOG;
  ArrayList<GalleryItem.MediaItem> mOH;
  ArrayList<GalleryItem.MediaItem> mOI;
  private a.b mOJ;
  int mOK;
  String mOL;
  LinkedList<a.a> mOM;
  boolean mON;
  boolean mOO;
  private View.OnClickListener mOP;

  public a(Context paramContext, a.b paramb)
  {
    AppMethodBeat.i(21372);
    this.mOF = 9;
    this.mOG = null;
    this.mOH = new ArrayList();
    this.mOI = new ArrayList();
    this.kIy = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    this.gLP = 10;
    this.mOM = new LinkedList();
    this.mON = false;
    this.mOO = true;
    this.mOP = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(21360);
        if (!(paramAnonymousView.getTag(2131823910) instanceof Integer))
          AppMethodBeat.o(21360);
        Object localObject;
        GalleryItem.MediaItem localMediaItem;
        while (true)
        {
          return;
          localObject = (Integer)paramAnonymousView.getTag(2131823910);
          if (localObject == null)
          {
            ab.e("MicroMsg.AlbumAdapter", "[onClick] null == position!");
            AppMethodBeat.o(21360);
          }
          else
          {
            localMediaItem = (GalleryItem.MediaItem)a.a(a.this).get(((Integer)localObject).intValue());
            if ((localMediaItem != null) && (!bo.isNullOrNil(localMediaItem.fPT)))
              break;
            ab.e("MicroMsg.AlbumAdapter", "[onClick] null == item!");
            AppMethodBeat.o(21360);
          }
        }
        ab.i("MicroMsg.AlbumAdapter", "click Image path:" + localMediaItem.fPT);
        int i;
        int j;
        if (a.b(a.this).contains(localMediaItem))
        {
          a.b(a.this).indexOf(localMediaItem);
          a.b(a.this).remove(localMediaItem);
          i = 1;
          j = 0;
        }
        while (true)
        {
          label171: if (j == 0)
            if (a.i(a.this) != null)
              a.i(a.this).W(a.this.mOI.size(), ((Integer)localObject).intValue(), i);
          while (true)
          {
            while (true)
            {
              if (1 != i)
                break label786;
              ((CheckBox)paramAnonymousView.getTag(2131823909)).setChecked(false);
              ((View)paramAnonymousView.getTag(2131826568)).setVisibility(0);
              ((View)paramAnonymousView.getTag(2131826568)).setBackgroundResource(2131690176);
              AppMethodBeat.o(21360);
              break;
              if ((com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ == 3) && (localMediaItem != null) && (localMediaItem.mMimeType.equalsIgnoreCase("image/gif")))
              {
                i = com.tencent.mm.a.e.cs(localMediaItem.fPT);
                if (!((d)g.M(d.class)).getProvider().Jq(localMediaItem.fPT))
                  try
                  {
                    localObject = a.c(a.this);
                    paramAnonymousView = new java/lang/StringBuilder;
                    paramAnonymousView.<init>();
                    ((com.tencent.mm.plugin.gallery.stub.a)localObject).aK(13459, i + ",1,,0");
                    com.tencent.mm.ui.base.h.bQ(a.d(a.this), a.d(a.this).getString(2131300196));
                    AppMethodBeat.o(21360);
                  }
                  catch (RemoteException paramAnonymousView)
                  {
                    while (true)
                      ab.printErrStackTrace("MicroMsg.AlbumAdapter", paramAnonymousView, "", new Object[0]);
                  }
              }
            }
            if (((a.e(a.this) == 2) || (a.e(a.this) == 3)) && ((localMediaItem instanceof GalleryItem.VideoMediaItem)) && (!bo.isNullOrNil(a.f(a.this))) && (a.f(a.this).equals("album_business_bubble_media_by_coordinate")) && (((GalleryItem.VideoMediaItem)localMediaItem).fPW >= a.g(a.this) * 1000 + 500))
            {
              com.tencent.mm.ui.base.h.bQ(a.d(a.this), a.d(a.this).getResources().getString(2131300214, new Object[] { Integer.valueOf(a.g(a.this)) }));
              AppMethodBeat.o(21360);
              break;
            }
            if (a.b(a.this).size() >= a.h(a.this))
              break label836;
            a.b(a.this).add(localMediaItem);
            a.b(a.this).size();
            i = 0;
            j = 0;
            break label171;
            if (a.e(a.this) == 1)
              com.tencent.mm.ui.base.h.bQ(a.d(a.this), a.d(a.this).getResources().getQuantityString(2131361804, a.h(a.this), new Object[] { Integer.valueOf(a.h(a.this)) }));
            else if (a.e(a.this) == 2)
              com.tencent.mm.ui.base.h.bQ(a.d(a.this), a.d(a.this).getResources().getQuantityString(2131361806, a.h(a.this), new Object[] { Integer.valueOf(a.h(a.this)) }));
            else
              com.tencent.mm.ui.base.h.bQ(a.d(a.this), a.d(a.this).getResources().getQuantityString(2131361805, a.h(a.this), new Object[] { Integer.valueOf(a.h(a.this)) }));
          }
          label786: ((CheckBox)paramAnonymousView.getTag(2131823909)).setChecked(true);
          ((View)paramAnonymousView.getTag(2131826568)).setVisibility(0);
          ((View)paramAnonymousView.getTag(2131826568)).setBackgroundResource(2131690155);
          AppMethodBeat.o(21360);
          break;
          label836: i = 1;
          j = 1;
        }
      }
    };
    this.mContext = paramContext;
    this.mOJ = paramb;
    while (i < 32)
    {
      paramContext = new GalleryItem.ImageMediaItem();
      this.mOH.add(paramContext);
      i++;
    }
    AppMethodBeat.o(21372);
  }

  public final void C(ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(21375);
    ab.d("MicroMsg.AlbumAdapter", "before set selected paths, selected[%s]", new Object[] { this.mOI });
    this.mOI.clear();
    if (paramArrayList != null)
    {
      Iterator localIterator = paramArrayList.iterator();
      while (localIterator.hasNext())
      {
        paramArrayList = (String)localIterator.next();
        GalleryItem.MediaItem localMediaItem = GalleryItem.MediaItem.a(0, 0L, paramArrayList, paramArrayList, "");
        if (com.tencent.mm.plugin.gallery.model.e.bCb() != null)
        {
          int i = com.tencent.mm.plugin.gallery.model.e.bCb().indexOf(localMediaItem);
          if (i >= 0)
          {
            localMediaItem = (GalleryItem.MediaItem)com.tencent.mm.plugin.gallery.model.e.bCb().get(i);
            if ((localMediaItem != null) && (localMediaItem.getType() == 2))
              this.mOI.add(GalleryItem.MediaItem.a(2, 0L, paramArrayList, "", ""));
          }
        }
        else
        {
          ab.d("MicroMsg.AlbumAdapter", "media item no exist on preview items.");
          this.mOI.add(GalleryItem.MediaItem.a(1, 0L, paramArrayList, "", ""));
        }
      }
    }
    ab.d("MicroMsg.AlbumAdapter", "after set selected paths, selected[%s]", new Object[] { this.mOI });
    AppMethodBeat.o(21375);
  }

  public final View a(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(21384);
    int i = paramInt;
    if (paramInt < this.mOM.size())
    {
      ab.d("MicroMsg.AlbumAdapter", "want to get header view headerId, old pos[%d]", new Object[] { Integer.valueOf(paramInt) });
      i = this.mOM.size();
    }
    if ((paramView == null) || (paramView.getParent() != null))
    {
      paramViewGroup = new ViewGroup.LayoutParams(-1, -2);
      paramView = new TextView(this.mContext);
      paramView.setBackgroundResource(2130839162);
      paramInt = this.mContext.getResources().getDimensionPixelSize(2131427858);
      int j = this.mContext.getResources().getDimensionPixelSize(2131427858);
      paramView.setPadding(j, paramInt, j, paramInt);
      paramView.setTextColor(this.mContext.getResources().getColor(2131690075));
      paramView.setTextSize(0, this.mContext.getResources().getDimensionPixelSize(2131427762));
      paramView.setTypeface(null, 1);
      paramView.setLayoutParams(paramViewGroup);
    }
    while (true)
    {
      paramViewGroup = ws(i);
      Date localDate = new Date(paramViewGroup.mOl);
      String str = com.tencent.mm.ui.gridviewheaders.a.dJg().a(localDate, this.mContext);
      ab.v("MicroMsg.AlbumAdapter", "getHeaderView, adjust pos[%d], date[%d] date[%s], headerStr[%s]", new Object[] { Integer.valueOf(i), Long.valueOf(paramViewGroup.mOl), localDate, str });
      ((TextView)paramView).setText(str);
      AppMethodBeat.o(21384);
      return paramView;
    }
  }

  public final void a(a.a parama)
  {
    AppMethodBeat.i(21373);
    if (parama == null)
    {
      ab.w("MicroMsg.AlbumAdapter", "addHeader error, header is null");
      AppMethodBeat.o(21373);
    }
    while (true)
    {
      return;
      this.mOM.remove(parama);
      this.mOM.add(parama);
      AppMethodBeat.o(21373);
    }
  }

  public final ArrayList<String> bCw()
  {
    AppMethodBeat.i(21374);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.mOI.iterator();
    while (localIterator.hasNext())
      localArrayList.add(((GalleryItem.MediaItem)localIterator.next()).fPT);
    AppMethodBeat.o(21374);
    return localArrayList;
  }

  public final int getCount()
  {
    AppMethodBeat.i(21377);
    int i = this.mOM.size();
    int j = this.mOH.size();
    AppMethodBeat.o(21377);
    return i + j;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(21379);
    if (paramInt < this.mOM.size())
      AppMethodBeat.o(21379);
    while (true)
    {
      return paramInt;
      paramInt = this.mOM.size();
      AppMethodBeat.o(21379);
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(21381);
    if (paramInt < this.mOM.size())
    {
      ab.i("MicroMsg.AlbumAdapter", "position[%d], get header view", new Object[] { Integer.valueOf(paramInt) });
      paramView = ((a.a)this.mOM.get(paramInt)).getView();
      AppMethodBeat.o(21381);
      return paramView;
    }
    int i = paramInt - this.mOM.size();
    GalleryItem.MediaItem localMediaItem = (GalleryItem.MediaItem)this.mOH.get(i);
    boolean bool;
    label107: d locald;
    if ((paramView == null) || (!(paramView.getTag() instanceof d)))
      if (paramView == null)
      {
        bool = true;
        ab.d("MicroMsg.AlbumAdapter", "converview is null?[%B]", new Object[] { Boolean.valueOf(bool) });
        paramView = LayoutInflater.from(this.mContext).inflate(2130970555, paramViewGroup, false);
        locald = new d((byte)0);
        locald.mOW = ((ImageView)paramView.findViewById(2131826569));
        locald.mOX = ((ImageView)paramView.findViewById(2131822355));
        locald.mOY = ((RelativeLayout)paramView.findViewById(2131825005));
        locald.mOZ = ((TextView)paramView.findViewById(2131826565));
        locald.moo = ((CheckBox)paramView.findViewById(2131823909));
        locald.mPa = ((TextView)paramView.findViewById(2131827238));
        locald.mop = paramView.findViewById(2131823910);
        locald.mPb = ((ImageView)paramView.findViewById(2131826568));
        locald.mop.setOnClickListener(this.mOP);
        locald.mop.setTag(2131823909, locald.moo);
        locald.mop.setTag(2131827238, locald.mPa);
        locald.mop.setTag(2131826568, locald.mPb);
        if ((com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ == 0) || (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ == 5) || (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ == 10) || (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ == 11) || (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ == 14))
        {
          locald.moo.setVisibility(8);
          locald.mPa.setVisibility(8);
          locald.mop.setVisibility(8);
          locald.mPb.setVisibility(8);
        }
        locald.mPc = ((ImageView)paramView.findViewById(2131826566));
        locald.mPd = ((ImageView)paramView.findViewById(2131826567));
        paramView.setTag(locald);
      }
    while (true)
    {
      if (localMediaItem != null)
        break label498;
      ab.e("MicroMsg.AlbumAdapter", "get item failed");
      AppMethodBeat.o(21381);
      break;
      bool = false;
      break label107;
      locald = (d)paramView.getTag();
    }
    label498: locald.mOW.setVisibility(0);
    if (localMediaItem.getType() == 2)
    {
      locald.mOY.setVisibility(0);
      a.c.a(locald.mOZ, (GalleryItem.VideoMediaItem)localMediaItem);
      label538: if (!localMediaItem.mMimeType.equalsIgnoreCase("edit"))
        break label629;
      locald.mPd.setVisibility(0);
    }
    Object localObject;
    String str;
    while (true)
    {
      localObject = localMediaItem.Wy();
      str = localMediaItem.fPT;
      if ((!bo.isNullOrNil((String)localObject)) || (!bo.isNullOrNil(str)))
        break label642;
      ab.e("MicroMsg.AlbumAdapter", "null or nil filepath: ".concat(String.valueOf(i)));
      AppMethodBeat.o(21381);
      break;
      locald.mOY.setVisibility(8);
      break label538;
      label629: locald.mPd.setVisibility(8);
    }
    label642: locald.mop.setTag(2131823910, Integer.valueOf(i));
    i = 2131301951;
    if (localMediaItem.getType() == 2)
      i = 2131304275;
    paramViewGroup = paramViewGroup.getContext().getString(i, new Object[] { Integer.valueOf(paramInt + 1 - this.mOM.size()), this.kIy.format(new Date(localMediaItem.mOl)) });
    ab.d("MicroMsg.AlbumAdapter", "thumbFilaPath: %s | origFilePath: %s | contentDescription %s", new Object[] { localObject, str, paramViewGroup });
    locald.mOX.setContentDescription(paramViewGroup);
    paramViewGroup = locald.mOW;
    h.a(locald.mOX, localMediaItem.getType(), (String)localObject, str, localMediaItem.mOk, -1, new a.1(this, paramViewGroup));
    if (this.mON)
      if (localMediaItem.getType() == 2)
      {
        locald.moo.setVisibility(8);
        locald.mPa.setVisibility(8);
        locald.mop.setVisibility(8);
        locald.mPb.setVisibility(8);
        label859: if (((com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ != 3) && (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ != 11)) || (localMediaItem == null) || (!localMediaItem.mMimeType.equalsIgnoreCase("image/gif")))
          break label1173;
        locald.mPc.setVisibility(0);
      }
    while (true)
    {
      AppMethodBeat.o(21381);
      break;
      if (this.mOI.contains(localMediaItem))
      {
        locald.moo.setChecked(true);
        paramViewGroup = locald.mPa;
        localObject = new StringBuilder();
        if (localMediaItem == null);
        for (paramInt = -1; ; paramInt = this.mOI.indexOf(localMediaItem))
        {
          paramViewGroup.setText(paramInt);
          locald.mPb.setBackgroundResource(2131690155);
          locald.mop.setVisibility(0);
          locald.moo.setVisibility(0);
          locald.mPb.setVisibility(0);
          break;
        }
      }
      locald.mPa.setVisibility(8);
      locald.moo.setChecked(false);
      locald.mPb.setBackgroundResource(2131690176);
      locald.moo.setVisibility(0);
      locald.mop.setVisibility(0);
      locald.mPb.setVisibility(0);
      break label859;
      if (this.mOI.contains(localMediaItem))
      {
        locald.moo.setChecked(true);
        locald.mPb.setVisibility(0);
        locald.mPb.setBackgroundResource(2131690155);
        break label859;
      }
      locald.moo.setChecked(false);
      locald.mPa.setVisibility(8);
      locald.mPb.setVisibility(0);
      locald.mPb.setBackgroundResource(2131690176);
      break label859;
      label1173: locald.mPc.setVisibility(8);
    }
  }

  public final int getViewTypeCount()
  {
    AppMethodBeat.i(21378);
    int i = this.mOM.size();
    AppMethodBeat.o(21378);
    return i + 1;
  }

  public final long tw(int paramInt)
  {
    AppMethodBeat.i(21382);
    int i = paramInt;
    if (paramInt < this.mOM.size())
    {
      ab.d("MicroMsg.AlbumAdapter", "want to get header view headerId, old pos[%d]", new Object[] { Integer.valueOf(paramInt) });
      i = this.mOM.size();
    }
    GalleryItem.MediaItem localMediaItem = ws(i);
    Date localDate = new Date(localMediaItem.mOl);
    long l = com.tencent.mm.ui.gridviewheaders.a.dJg().b(localDate);
    ab.v("MicroMsg.AlbumAdapter", "getHeaderId, adjust pos[%d], date[%d] date[%s], headerID[%d]", new Object[] { Integer.valueOf(i), Long.valueOf(localMediaItem.mOl), localDate, Long.valueOf(l) });
    AppMethodBeat.o(21382);
    return l;
  }

  public final ArrayList<GalleryItem.MediaItem> wr(int paramInt)
  {
    AppMethodBeat.i(21376);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.mOH.iterator();
    while (localIterator.hasNext())
    {
      GalleryItem.MediaItem localMediaItem = (GalleryItem.MediaItem)localIterator.next();
      if (localMediaItem.getType() == paramInt)
        localArrayList.add(localMediaItem);
    }
    AppMethodBeat.o(21376);
    return localArrayList;
  }

  public final GalleryItem.MediaItem ws(int paramInt)
  {
    AppMethodBeat.i(21380);
    Object localObject;
    if (paramInt < this.mOM.size())
    {
      ab.i("MicroMsg.AlbumAdapter", "get header, pos[%d]", new Object[] { Integer.valueOf(paramInt) });
      localObject = null;
      AppMethodBeat.o(21380);
    }
    while (true)
    {
      return localObject;
      paramInt -= this.mOM.size();
      if (paramInt >= this.mOH.size())
      {
        ab.w("MicroMsg.AlbumAdapter", "get item error, media items size[%d], adjustPos[%d]", new Object[] { Integer.valueOf(this.mOH.size()), Integer.valueOf(paramInt) });
        localObject = new GalleryItem.ImageMediaItem();
        ((GalleryItem.ImageMediaItem)localObject).mOl = bo.anU();
        AppMethodBeat.o(21380);
      }
      else
      {
        localObject = (GalleryItem.MediaItem)this.mOH.get(paramInt);
        AppMethodBeat.o(21380);
      }
    }
  }

  public final String wt(int paramInt)
  {
    AppMethodBeat.i(21383);
    int i = paramInt;
    if (paramInt < this.mOM.size())
    {
      ab.d("MicroMsg.AlbumAdapter", "want to get header view headerId, old pos[%d]", new Object[] { Integer.valueOf(paramInt) });
      i = this.mOM.size();
    }
    Object localObject = ws(i);
    if (!bo.isNullOrNil(((GalleryItem.MediaItem)localObject).mOn))
    {
      localObject = ((GalleryItem.MediaItem)localObject).mOn;
      AppMethodBeat.o(21383);
    }
    while (true)
    {
      return localObject;
      localObject = new Date(((GalleryItem.MediaItem)localObject).mOl);
      localObject = com.tencent.mm.ui.gridviewheaders.a.dJg().a((Date)localObject, this.mContext);
      AppMethodBeat.o(21383);
    }
  }

  static final class d
  {
    public ImageView mOW;
    public ImageView mOX;
    public RelativeLayout mOY;
    public TextView mOZ;
    public TextView mPa;
    public ImageView mPb;
    public ImageView mPc;
    public ImageView mPd;
    public CheckBox moo;
    public View mop;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.a
 * JD-Core Version:    0.6.2
 */