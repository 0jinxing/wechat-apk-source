package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.storage.ab;
import java.util.List;

final class SnsSelectContactDialog$a extends BaseAdapter
{
  private Context context;
  private List<String> items;
  private int rgh;
  private int type;

  public SnsSelectContactDialog$a(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(39189);
    this.rgh = 0;
    Object localObject;
    this.items = localObject;
    this.context = paramInt;
    this.type = 0;
    refresh();
    AppMethodBeat.o(39189);
  }

  public final int getCount()
  {
    return this.rgh;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(39191);
    Object localObject = this.items.get(paramInt);
    AppMethodBeat.o(39191);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(39192);
    if (paramView == null)
    {
      paramViewGroup = new SnsSelectContactDialog.b();
      if (this.type == 0)
      {
        paramView = View.inflate(this.context, 2130970824, null);
        paramViewGroup.image = ((ImageView)paramView.findViewById(2131820629));
        paramViewGroup.rvr = ((ImageView)paramView.findViewById(2131827676));
        paramView.setTag(paramViewGroup);
        label66: paramView.setVisibility(0);
        if (paramInt != this.rgh - 1)
          break label170;
        paramViewGroup.image.setBackgroundDrawable(null);
        paramViewGroup.image.setImageResource(2130840253);
        paramViewGroup.rvr.setVisibility(8);
        if (this.items.size() >= ab.xID)
          paramView.setVisibility(8);
      }
    }
    while (true)
    {
      paramViewGroup.image.setScaleType(ImageView.ScaleType.CENTER_CROP);
      AppMethodBeat.o(39192);
      return paramView;
      paramView = View.inflate(this.context, 2130970744, null);
      break;
      paramViewGroup = (SnsSelectContactDialog.b)paramView.getTag();
      break label66;
      label170: paramViewGroup.image.setBackgroundDrawable(null);
      paramViewGroup.rvr.setVisibility(0);
      Object localObject;
      if (this.type == 0)
      {
        localObject = (String)this.items.get(paramInt);
        a.b.b(paramViewGroup.image, (String)localObject);
      }
      else
      {
        localObject = d.d((String)this.items.get(paramInt), af.cnN(), af.cnN(), true);
        paramViewGroup.image.setImageBitmap((Bitmap)localObject);
      }
    }
  }

  public final void refresh()
  {
    AppMethodBeat.i(39190);
    if (this.items == null);
    for (this.rgh = 0; ; this.rgh = this.items.size())
    {
      this.rgh += 1;
      notifyDataSetChanged();
      AppMethodBeat.o(39190);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsSelectContactDialog.a
 * JD-Core Version:    0.6.2
 */