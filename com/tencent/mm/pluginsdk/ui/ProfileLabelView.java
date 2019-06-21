package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.label.a.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.m;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bv;
import java.util.ArrayList;
import java.util.List;

public class ProfileLabelView extends ProfileItemView
{
  public TextView pmi;
  public TextView viw;

  public ProfileLabelView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ProfileLabelView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final boolean cby()
  {
    AppMethodBeat.i(27531);
    Object localObject1;
    if (this.viw != null)
    {
      localObject1 = this.viw.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject1).width = com.tencent.mm.bz.a.al(getContext(), 2131427668);
      this.viw.setLayoutParams((ViewGroup.LayoutParams)localObject1);
    }
    boolean bool;
    if (com.tencent.mm.n.a.jh(this.ldh.field_type))
      if (r.mG(this.ldh.field_username))
      {
        setVisibility(8);
        AppMethodBeat.o(27531);
        bool = false;
      }
    while (true)
    {
      return bool;
      localObject1 = this.ldh.field_contactLabelIds;
      Object localObject2 = (ArrayList)com.tencent.mm.plugin.label.a.a.bJa().PG((String)localObject1);
      if ((!bo.isNullOrNil((String)localObject1)) && (localObject2 != null) && (((ArrayList)localObject2).size() > 0))
      {
        this.pmi.setText(j.b(getContext(), bo.c((List)localObject2, getContext().getResources().getString(2131298411))));
        AppMethodBeat.o(27531);
        bool = true;
      }
      else
      {
        setVisibility(8);
        AppMethodBeat.o(27531);
        bool = false;
        continue;
        localObject1 = this.ldh.field_encryptUsername;
        if (!bo.isNullOrNil((String)localObject1))
          aw.ZK();
        for (localObject1 = c.XN().RB((String)localObject1); ; localObject1 = c.XN().RB(this.ldh.field_username))
        {
          if (localObject1 == null)
            break label314;
          localObject2 = ((bv)localObject1).field_contactLabels;
          localObject1 = (ArrayList)com.tencent.mm.plugin.label.a.a.bJa().PF((String)localObject2);
          if ((bo.isNullOrNil((String)localObject2)) || (localObject1 == null) || (((ArrayList)localObject1).size() <= 0))
            break label314;
          this.pmi.setText(j.b(getContext(), bo.c((List)localObject1, getContext().getResources().getString(2131298411))));
          AppMethodBeat.o(27531);
          bool = true;
          break;
          aw.ZK();
        }
        label314: setVisibility(8);
        AppMethodBeat.o(27531);
        bool = false;
      }
    }
  }

  public int getLayout()
  {
    return 2130970407;
  }

  public final void init()
  {
    AppMethodBeat.i(27530);
    this.pmi = ((TextView)findViewById(2131826655));
    this.viw = ((TextView)findViewById(2131826654));
    setClickable(true);
    AppMethodBeat.o(27530);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.ProfileLabelView
 * JD-Core Version:    0.6.2
 */