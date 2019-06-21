package com.tencent.mm.plugin.fav.ui.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.abs;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

public class FavTagEntrance extends LinearLayout
  implements k.a
{
  private long cHh;
  private TextView mpW;
  private String mpX;

  public FavTagEntrance(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(74700);
    this.cHh = -1L;
    this.mpX = String.valueOf(this.cHh);
    AppMethodBeat.o(74700);
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(74704);
    ab.d("MicroMsg.FavTagEntrence", "on notify change event %s, favIDStr %s", new Object[] { paramString, this.mpX });
    if (this.mpX.equals(paramString))
    {
      paramString = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(this.cHh);
      if (paramString == null)
      {
        ab.w("MicroMsg.FavTagEntrence", "id[%d] info is null, return", new Object[] { Long.valueOf(this.cHh) });
        AppMethodBeat.o(74704);
      }
    }
    while (true)
    {
      return;
      setTagContent(paramString.field_tagProto.wiJ);
      AppMethodBeat.o(74704);
    }
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(74701);
    super.onFinishInflate();
    this.mpW = ((TextView)findViewById(2131824003));
    setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(74699);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("key_fav_scene", 1);
        paramAnonymousView.putExtra("key_fav_item_id", FavTagEntrance.a(FavTagEntrance.this));
        b.b(FavTagEntrance.this.getContext(), ".ui.FavTagEditUI", paramAnonymousView);
        AppMethodBeat.o(74699);
      }
    });
    AppMethodBeat.o(74701);
  }

  public void setFavItemID(long paramLong)
  {
    AppMethodBeat.i(74702);
    this.cHh = paramLong;
    this.mpX = String.valueOf(paramLong);
    AppMethodBeat.o(74702);
  }

  public void setTagContent(List<String> paramList)
  {
    AppMethodBeat.i(74703);
    if (this.mpW == null)
      AppMethodBeat.o(74703);
    while (true)
    {
      return;
      Object localObject = getContext();
      if ((localObject == null) || (paramList == null) || (paramList.isEmpty()))
      {
        localObject = "";
        if (bo.isNullOrNil((String)localObject))
        {
          this.mpW.setText("");
          this.mpW.setHint(2131299617);
          AppMethodBeat.o(74703);
        }
      }
      else
      {
        String str1 = (String)paramList.get(0);
        String str2 = ((Context)localObject).getResources().getString(2131299751);
        for (int i = 1; ; i++)
        {
          localObject = str1;
          if (i >= paramList.size())
            break;
          str1 = str1 + str2 + (String)paramList.get(i);
        }
        this.mpW.setText(j.b(getContext(), (CharSequence)localObject, this.mpW.getTextSize()));
        AppMethodBeat.o(74703);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.widget.FavTagEntrance
 * JD-Core Version:    0.6.2
 */