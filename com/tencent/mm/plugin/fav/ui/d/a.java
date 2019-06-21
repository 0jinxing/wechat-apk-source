package com.tencent.mm.plugin.fav.ui.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.fav.ui.l;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abh;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.protocal.protobuf.abs;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bd;
import java.util.List;
import java.util.Map;

public abstract class a
{
  protected l mhy = null;
  public final a.a moE = new a.a();

  public a(l paraml)
  {
    this.mhy = paraml;
  }

  public abstract View a(View paramView, ViewGroup paramViewGroup, com.tencent.mm.plugin.fav.a.g paramg);

  protected final View a(View paramView, a.b paramb, com.tencent.mm.plugin.fav.a.g paramg)
  {
    if (paramView == null)
      throw new NullPointerException("base item view is null");
    paramb.moH = paramView.findViewById(2131823915);
    if (paramb.moH == null)
      throw new IllegalArgumentException("base item view do not contain id named favTypeLayout");
    paramb.gxi = ((TextView)paramView.findViewById(2131820611));
    if (paramb.gxi == null)
      throw new IllegalArgumentException("base item view do not contain id named fav_name");
    paramb.enf = ((TextView)paramView.findViewById(2131820618));
    if (paramb.enf == null)
      throw new IllegalArgumentException("base item view do not contain id named fav_time");
    paramb.gnD = ((CheckBox)paramView.findViewById(2131820600));
    if (paramb.gnD == null)
      throw new IllegalArgumentException("base item view do not contain id named checkbox");
    paramb.moI = ((ImageView)paramView.findViewById(2131823916));
    if (paramb.moI == null)
      throw new IllegalArgumentException("base item view do not contain id named tagIV");
    paramb.gnD.setOnCheckedChangeListener(new a.1(this));
    paramb.mgf = paramg;
    paramView.setTag(paramb);
    paramb.moJ = ((LinearLayout)paramView.findViewById(2131823913));
    paramb.moK = ((TextView)paramView.findViewById(2131823914));
    paramb.moK.setOnClickListener(new a.2(this));
    return paramView;
  }

  public abstract void a(View paramView, abh paramabh);

  protected final void a(a.b paramb, com.tencent.mm.plugin.fav.a.g paramg)
  {
    paramb.mgf = paramg;
    label59: Context localContext;
    Object localObject;
    label183: boolean bool;
    if (paramb.mgf.field_type == 18)
    {
      paramb.moH.setVisibility(0);
      if (this.moE.mlp)
        break label311;
      paramb.enf.setText(com.tencent.mm.plugin.fav.ui.j.g(paramb.enf.getContext(), paramb.mgf.field_updateTime));
      localContext = paramb.gxi.getContext();
      localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoN(paramb.mgf.field_fromUser);
      if ((localObject != null) && (((ap)localObject).field_username.equals(paramb.mgf.field_fromUser)))
        break label331;
      ab.w("MicroMsg.FavBaseListItem", "render name, user is %s, but name is null", new Object[] { paramb.mgf.field_fromUser });
      paramb.gxi.setText("");
      ao.a.flu.a(paramb.mgf.field_fromUser, "", null);
      if (!paramb.mgf.bux())
        break label440;
      paramb.moJ.setVisibility(0);
      paramb.gnD.setTag(paramg);
      if ((!this.moE.mlh) && (!this.moE.mlp))
        break label458;
      paramb.gnD.setVisibility(0);
      localObject = paramb.gnD;
      if (this.moE.mli.get(Long.valueOf(paramg.field_localId)) == null)
        break label452;
      bool = true;
      label250: ((CheckBox)localObject).setChecked(bool);
      label257: paramb.moK.setTag(paramg);
      if ((paramg.field_tagProto.wiJ == null) || (paramg.field_tagProto.wiJ.isEmpty()))
        break label470;
      paramb.moI.setVisibility(0);
    }
    while (true)
    {
      return;
      paramb.moH.setVisibility(8);
      break;
      label311: paramb.enf.setText(com.tencent.mm.plugin.fav.a.b.iv(paramb.mgf.field_datatotalsize));
      break label59;
      label331: if (t.kH(paramb.mgf.field_fromUser))
      {
        localObject = paramb.mgf.field_favProto.wit;
        if (r.Yz().equals(((abl)localObject).cEV))
          localObject = com.tencent.mm.plugin.fav.a.b.LC(((abl)localObject).toUser);
      }
      while (true)
      {
        paramb.gxi.setText(com.tencent.mm.pluginsdk.ui.e.j.b(localContext, (CharSequence)localObject, paramb.gxi.getTextSize()));
        break;
        localObject = ((com.tencent.mm.plugin.messenger.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.b.class)).mI(((abl)localObject).cEV);
        continue;
        localObject = com.tencent.mm.plugin.fav.a.b.LC(((ap)localObject).field_username);
      }
      label440: paramb.moJ.setVisibility(8);
      break label183;
      label452: bool = false;
      break label250;
      label458: paramb.gnD.setVisibility(8);
      break label257;
      label470: paramb.moI.setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.d.a
 * JD-Core Version:    0.6.2
 */