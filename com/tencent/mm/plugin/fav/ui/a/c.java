package com.tencent.mm.plugin.fav.ui.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.l;
import com.tencent.mm.plugin.fav.a.l.a;
import com.tencent.mm.plugin.fav.ui.widget.FavTagPanel;
import com.tencent.mm.protocal.protobuf.abp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMTagPanel.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public abstract class c extends BaseAdapter
  implements l.a, MMTagPanel.a
{
  private Context context;
  private int mlt = 2131690316;
  private int mlu = 2130838778;
  private Set<String> mlv = new HashSet();

  public c(Context paramContext)
  {
    this.context = paramContext;
  }

  public final void JR(String paramString)
  {
    Mf(paramString);
    Mb(paramString);
  }

  public final void JS(String paramString)
  {
    Me(paramString);
    Ma(paramString);
  }

  public final void JT(String paramString)
  {
  }

  public final void JU(String paramString)
  {
  }

  public final void JV(String paramString)
  {
  }

  protected abstract void Ma(String paramString);

  protected abstract void Mb(String paramString);

  public final void Me(String paramString)
  {
    this.mlv.add(paramString);
    notifyDataSetChanged();
  }

  public final void Mf(String paramString)
  {
    this.mlv.remove(paramString);
    notifyDataSetChanged();
  }

  public final void bQ(List<String> paramList)
  {
    this.mlv.clear();
    if (paramList != null)
      this.mlv.addAll(paramList);
  }

  public final void bmm()
  {
  }

  public final void buF()
  {
    ab.d("MicroMsg.FavoriteTagPanelAdapter", "on addtag callback");
    notifyDataSetChanged();
  }

  public final void buG()
  {
    ab.d("MicroMsg.FavoriteTagPanelAdapter", "on removetag callback");
    notifyDataSetChanged();
  }

  public int getCount()
  {
    ((ae)g.M(ae.class)).getFavTagSetMgr();
    return 1;
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Set localSet;
    Object localObject;
    boolean bool;
    if (paramView == null)
    {
      paramView = View.inflate(this.context, 2130969530, null);
      paramViewGroup = new c.a();
      paramViewGroup.jKK = ((TextView)paramView.findViewById(2131823978));
      paramViewGroup.mlw = ((FavTagPanel)paramView.findViewById(2131823979));
      paramViewGroup.mlw.setCallBack(this);
      paramViewGroup.mlw.setTagNormalBG(this.mlu);
      paramViewGroup.mlw.setTagNormalTextColorRes(this.mlt);
      paramView.setTag(paramViewGroup);
      paramViewGroup = paramViewGroup.mlw;
      localSet = this.mlv;
      localObject = ((ae)g.M(ae.class)).getFavTagSetMgr().vy(paramInt);
      if ((localObject != null) && (!((List)localObject).isEmpty()))
        break label175;
      if (localObject != null)
        break label169;
      bool = true;
      label137: ab.e("MicroMsg.FavTagPanel", "setTagListByTagInfo,null == tags ?%B,", new Object[] { Boolean.valueOf(bool) });
    }
    while (true)
    {
      return paramView;
      paramViewGroup = (c.a)paramView.getTag();
      break;
      label169: bool = false;
      break label137;
      label175: ab.i("MicroMsg.FavTagPanel", "setTagListByTagInfo,tags.size = %d", new Object[] { Integer.valueOf(((List)localObject).size()) });
      LinkedList localLinkedList = new LinkedList();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
        localLinkedList.add(((abp)((Iterator)localObject).next()).rMJ);
      paramViewGroup.a(localSet, localLinkedList);
    }
  }

  public final void q(boolean paramBoolean, int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.a.c
 * JD-Core Version:    0.6.2
 */