package com.tencent.mm.plugin.gallery.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.model.GalleryItem.AlbumItem;
import com.tencent.mm.plugin.gallery.model.GalleryItem.ImageMediaItem;
import com.tencent.mm.plugin.gallery.model.GalleryItem.MediaItem;
import com.tencent.mm.plugin.gallery.model.e;
import com.tencent.mm.plugin.gallery.model.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class b extends BaseAdapter
{
  private Context mContext;
  private int mOu;
  LinkedList<GalleryItem.AlbumItem> mQe;
  GalleryItem.AlbumItem mQf;
  String mQg;
  private int mQh;

  public b(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(21447);
    this.mQg = "";
    this.mQh = 0;
    this.mContext = paramContext;
    this.mQe = new LinkedList();
    this.mOu = paramInt;
    this.mQf = new GalleryItem.AlbumItem("", 0);
    this.mQf.mOh = new GalleryItem.ImageMediaItem();
    this.mQh = paramContext.getResources().getDimensionPixelSize(2131427858);
    AppMethodBeat.o(21447);
  }

  public final int getCount()
  {
    AppMethodBeat.i(21448);
    int i = this.mQe.size();
    AppMethodBeat.o(21448);
    return i + 1;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(21450);
    ab.i("MicroMsg.GalleryAdapter", "duanyi test getview:".concat(String.valueOf(paramInt)));
    GalleryItem.AlbumItem localAlbumItem = ww(paramInt);
    if (paramView == null)
    {
      paramView = LayoutInflater.from(this.mContext).inflate(2130970556, paramViewGroup, false);
      paramViewGroup = new a((byte)0);
      paramViewGroup.mOX = ((ImageView)paramView.findViewById(2131827239));
      paramViewGroup.gnC = ((TextView)paramView.findViewById(2131827240));
      paramViewGroup.moY = ((ImageView)paramView.findViewById(2131825005));
      paramViewGroup.mQi = ((TextView)paramView.findViewById(2131827241));
      paramViewGroup.mQj = ((ImageView)paramView.findViewById(2131827242));
      paramView.setTag(paramViewGroup);
      if (!this.mQg.equals(localAlbumItem.mOg))
        break label265;
      paramViewGroup.mQj.setVisibility(0);
      label148: if (paramInt != 0)
        break label310;
      paramViewGroup.mOX.setImageResource(2130839830);
      if (localAlbumItem.mOh != null)
        h.a(paramViewGroup.mOX, localAlbumItem.mOh.getType(), localAlbumItem.Wy(), localAlbumItem.mOh.fPT, localAlbumItem.bCq());
      if (e.bBZ().mOu != 1)
        break label276;
      paramViewGroup.gnC.setText(2131300166);
    }
    while (true)
    {
      paramViewGroup.mOX.setVisibility(0);
      paramViewGroup.gnC.setVisibility(0);
      paramViewGroup.mQi.setVisibility(8);
      AppMethodBeat.o(21450);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label265: paramViewGroup.mQj.setVisibility(4);
      break label148;
      label276: if (e.bBZ().mOu == 3)
        paramViewGroup.gnC.setText(2131300167);
      else
        paramViewGroup.gnC.setText(2131300168);
    }
    label310: paramViewGroup.mOX.setVisibility(0);
    paramViewGroup.gnC.setVisibility(0);
    paramViewGroup.gnC.setText(localAlbumItem.mOg);
    paramViewGroup.mQi.setVisibility(0);
    paramViewGroup.mQi.setText(this.mContext.getString(2131300177, new Object[] { Integer.valueOf(localAlbumItem.cyR) }));
    Object localObject;
    if ((paramViewGroup.moY != null) && (localAlbumItem.mOh != null))
    {
      localObject = paramViewGroup.moY;
      if (localAlbumItem.mOh.getType() == 2)
      {
        paramInt = 0;
        label412: ((ImageView)localObject).setVisibility(paramInt);
      }
    }
    else
    {
      localObject = localAlbumItem.Wy();
      if ((bo.isNullOrNil((String)localObject)) || (localAlbumItem.mOh == null))
        break label486;
      h.a(paramViewGroup.mOX, localAlbumItem.mOh.getType(), (String)localObject, localAlbumItem.mOh.fPT, localAlbumItem.bCq());
    }
    while (true)
    {
      AppMethodBeat.o(21450);
      break;
      paramInt = 8;
      break label412;
      label486: if ((localAlbumItem.mOh != null) && (localAlbumItem.mOh.getType() == 2))
      {
        h.a(paramViewGroup.mOX, localAlbumItem.mOh.getType(), null, localAlbumItem.mOh.fPT, localAlbumItem.bCq());
      }
      else
      {
        ab.e("MicroMsg.GalleryAdapter", "get folder failed");
        paramViewGroup.mOX.setVisibility(8);
        paramViewGroup.gnC.setVisibility(8);
      }
    }
  }

  public final GalleryItem.AlbumItem ww(int paramInt)
  {
    AppMethodBeat.i(21449);
    GalleryItem.AlbumItem localAlbumItem;
    if (paramInt == 0)
    {
      localAlbumItem = this.mQf;
      AppMethodBeat.o(21449);
    }
    while (true)
    {
      return localAlbumItem;
      localAlbumItem = (GalleryItem.AlbumItem)this.mQe.get(paramInt - 1);
      AppMethodBeat.o(21449);
    }
  }

  static final class a
  {
    public TextView gnC;
    public ImageView mOX;
    public TextView mQi;
    public ImageView mQj;
    public ImageView moY;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.b
 * JD-Core Version:    0.6.2
 */