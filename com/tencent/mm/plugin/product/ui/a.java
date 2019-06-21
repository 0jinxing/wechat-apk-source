package com.tencent.mm.plugin.product.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class a extends BaseAdapter
{
  private Context pik;
  private List<com.tencent.mm.plugin.product.c.a> pil;
  private List<Boolean> pim;
  private int pio = 1;

  public a(Context paramContext)
  {
    this.pik = paramContext;
  }

  private com.tencent.mm.plugin.product.c.a AN(int paramInt)
  {
    AppMethodBeat.i(44031);
    com.tencent.mm.plugin.product.c.a locala = (com.tencent.mm.plugin.product.c.a)this.pil.get(paramInt);
    AppMethodBeat.o(44031);
    return locala;
  }

  public final void a(Activity paramActivity, View paramView, int paramInt)
  {
    AppMethodBeat.i(44029);
    paramView = (b)paramView.getTag();
    ab.i("MicroMsg.MallCustomActionAdapter", "onItemClick holder.type" + paramView.type);
    ab.i("MicroMsg.MallCustomActionAdapter", "onItemClick holder.content" + paramView.pis);
    switch (paramView.type)
    {
    case 3:
    default:
      ab.w("MicroMsg.MallCustomActionAdapter", "not support type");
      AppMethodBeat.o(44029);
    case 0:
    case 1:
    case 2:
    case 4:
    case 6:
      while (true)
      {
        return;
        AppMethodBeat.o(44029);
        continue;
        if (!(paramView.pis instanceof String))
          break;
        paramActivity = new Intent();
        paramActivity.putExtra("rawUrl", (String)paramView.pis);
        paramActivity.putExtra("showShare", false);
        d.b(this.pik, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramActivity, 10000);
        AppMethodBeat.o(44029);
        continue;
        if (!(paramView.pis instanceof ArrayList))
          break;
        Object localObject = (ArrayList)paramView.pis;
        paramView = new Intent(paramActivity, MallGalleryUI.class);
        paramView.putExtra("keys_img_urls", (Serializable)localObject);
        paramActivity.startActivity(paramView);
        AppMethodBeat.o(44029);
        continue;
        if (!(paramView.pis instanceof String))
          break;
        String str = (String)paramView.pis;
        localObject = new Intent();
        ((Intent)localObject).putExtra("title", paramView.title);
        ((Intent)localObject).putExtra("neverGetA8Key", false);
        ((Intent)localObject).putExtra("showShare", false);
        ((Intent)localObject).putExtra("show_bottom", false);
        ((Intent)localObject).putExtra("data", str);
        ((Intent)localObject).putExtra("QRDataFlag", false);
        d.b(paramActivity, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", (Intent)localObject);
        AppMethodBeat.o(44029);
      }
    case 5:
    }
    if (((Boolean)this.pim.get(paramInt)).booleanValue())
      this.pim.set(paramInt, Boolean.FALSE);
    while (true)
    {
      notifyDataSetChanged();
      AppMethodBeat.o(44029);
      break;
      this.pim.set(paramInt, Boolean.TRUE);
    }
  }

  public final void cz(List<com.tencent.mm.plugin.product.c.a> paramList)
  {
    AppMethodBeat.i(44028);
    this.pil = paramList;
    this.pio = 0;
    this.pim = new ArrayList();
    if (this.pil != null)
    {
      HashSet localHashSet = new HashSet();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.product.c.a locala = (com.tencent.mm.plugin.product.c.a)localIterator.next();
        this.pim.add(Boolean.FALSE);
        localHashSet.add(Integer.valueOf(locala.jCt));
      }
      this.pio = paramList.size();
    }
    if (this.pio <= 0)
      this.pio = 1;
    AppMethodBeat.o(44028);
  }

  public final int getCount()
  {
    AppMethodBeat.i(44030);
    int i;
    if (this.pil != null)
    {
      i = this.pil.size();
      AppMethodBeat.o(44030);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(44030);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(44032);
    paramInt = AN(paramInt).jCt;
    AppMethodBeat.o(44032);
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(44033);
    com.tencent.mm.plugin.product.c.a locala;
    if (paramView == null)
    {
      paramView = View.inflate(this.pik, 2130970390, null);
      paramViewGroup = new b();
      paramViewGroup.iDT = ((TextView)paramView.findViewById(2131821185));
      paramViewGroup.pip = ((TextView)paramView.findViewById(2131826598));
      paramViewGroup.piq = ((ImageView)paramView.findViewById(2131826599));
      paramViewGroup.pir = ((HtmlTextView)paramView.findViewById(2131826600));
      paramView.setTag(paramViewGroup);
      locala = AN(paramInt);
      if (locala != null)
      {
        paramViewGroup.iDT.setText(locala.Name);
        paramViewGroup.pip.setText(locala.phA);
        paramViewGroup.type = locala.jCt;
        paramViewGroup.pis = locala.ncM;
        paramViewGroup.title = locala.Name;
        switch (locala.jCt)
        {
        case 1:
        case 2:
        case 3:
        case 4:
        default:
        case 0:
        case 5:
        case 6:
        }
      }
    }
    label296: 
    while (true)
    {
      AppMethodBeat.o(44033);
      return paramView;
      paramViewGroup = (b)paramView.getTag();
      break;
      paramViewGroup.piq.setVisibility(8);
      continue;
      if (((Boolean)this.pim.get(paramInt)).booleanValue())
        paramViewGroup.pir.setVisibility(0);
      while (true)
      {
        if (paramViewGroup.pir.getText().equals(locala.ncM))
          break label296;
        paramViewGroup.pir.setText(locala.ncM);
        break;
        paramViewGroup.pir.setVisibility(8);
      }
    }
  }

  public final int getViewTypeCount()
  {
    return this.pio;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.a
 * JD-Core Version:    0.6.2
 */