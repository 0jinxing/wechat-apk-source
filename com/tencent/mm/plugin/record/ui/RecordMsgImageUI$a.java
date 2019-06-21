package com.tencent.mm.plugin.record.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.record.b.l;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MultiTouchImageView;
import java.util.LinkedList;
import java.util.List;

final class RecordMsgImageUI$a extends BaseAdapter
{
  long cvx;
  List<aar> elG;
  l pKH;

  private RecordMsgImageUI$a()
  {
    AppMethodBeat.i(24307);
    this.elG = new LinkedList();
    this.cvx = -1L;
    AppMethodBeat.o(24307);
  }

  public final aar BI(int paramInt)
  {
    AppMethodBeat.i(24309);
    aar localaar = (aar)this.elG.get(paramInt);
    AppMethodBeat.o(24309);
    return localaar;
  }

  public final int getCount()
  {
    AppMethodBeat.i(24308);
    int i = this.elG.size();
    AppMethodBeat.o(24308);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(24310);
    l locall = this.pKH;
    aar localaar = BI(paramInt);
    long l = this.cvx;
    Object localObject = locall.a(localaar, l, false);
    if (localObject == null)
    {
      boolean bool = locall.a(localaar, l);
      ab.d("MicroMsg.RecordMsgImgService", "get image fail, try download, can retry:%B", new Object[] { Boolean.valueOf(bool) });
      com.tencent.mm.plugin.record.b.n.b(localaar, l, bool);
    }
    if (localObject == null)
    {
      ab.w("MicroMsg.ShowImageUI", "get image fail");
      if (paramView != null)
      {
        localObject = paramView;
        if (!(paramView instanceof MultiTouchImageView));
      }
      else
      {
        localObject = View.inflate(paramViewGroup.getContext(), 2130970678, null);
      }
      ((ImageView)((View)localObject).findViewById(2131822184)).setImageResource(2131231218);
      ((View)localObject).setLayoutParams(new Gallery.LayoutParams(-1, -1));
      AppMethodBeat.o(24310);
      paramView = (View)localObject;
      return paramView;
    }
    paramViewGroup = paramViewGroup.getContext();
    if ((paramView == null) || (!(paramView instanceof MultiTouchImageView)))
      paramView = new MultiTouchImageView(paramViewGroup, ((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight());
    while (true)
    {
      com.tencent.mm.sdk.platformtools.n.w(paramView, ((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight());
      paramView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
      paramView.setImageBitmap((Bitmap)localObject);
      paramView.setMaxZoomDoubleTab(true);
      AppMethodBeat.o(24310);
      break;
      paramView = (MultiTouchImageView)paramView;
      paramView.bW(((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgImageUI.a
 * JD-Core Version:    0.6.2
 */