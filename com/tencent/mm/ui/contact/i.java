package com.tencent.mm.ui.contact;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.d;
import com.tencent.mm.aj.e;
import com.tencent.mm.aj.e.a;
import com.tencent.mm.aj.e.a.b;
import com.tencent.mm.aj.z;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class i extends LinearLayout
  implements e.a
{
  private Context context;
  private LinearLayout mpt;
  private List<String> zms;
  private Map<String, View> zmt;
  private i.a zmu;

  public i(Context paramContext, i.a parama)
  {
    super(paramContext);
    AppMethodBeat.i(33704);
    this.mpt = null;
    this.context = paramContext;
    this.zmu = parama;
    init();
    AppMethodBeat.o(33704);
  }

  private void init()
  {
    int i = 0;
    AppMethodBeat.i(33706);
    Object localObject1 = z.aeR();
    Object localObject2 = new ArrayList();
    Object localObject3 = new StringBuilder();
    e.a((StringBuilder)localObject3);
    e.c((StringBuilder)localObject3);
    ((StringBuilder)localObject3).append(" and bizinfo.type = 2 ");
    ((StringBuilder)localObject3).append(" order by ");
    ((StringBuilder)localObject3).append(e.aet());
    localObject3 = ((StringBuilder)localObject3).toString();
    ab.i("MicroMsg.BizInfoStorage", "getEnterpriseFatherBizLst sql %s", new Object[] { localObject3 });
    localObject1 = ((e)localObject1).rawQuery((String)localObject3, new String[0]);
    if (localObject1 != null)
    {
      if (((Cursor)localObject1).moveToFirst())
        do
          ((ArrayList)localObject2).add(((Cursor)localObject1).getString(0));
        while (((Cursor)localObject1).moveToNext());
      ((Cursor)localObject1).close();
    }
    this.zms = ((List)localObject2);
    if ((this.zms == null) || (this.zms.size() <= 0))
    {
      ab.e("MicroMsg.EnterpriseBizView", "bizList is null");
      AppMethodBeat.o(33706);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.EnterpriseBizView", "biz list size = %s", new Object[] { Integer.valueOf(this.zms.size()) });
      this.zmt = new HashMap();
      int j = i;
      if (this.mpt == null)
      {
        View.inflate(getContext(), 2130969392, this);
        this.mpt = ((LinearLayout)findViewById(2131821064));
      }
      for (j = i; j < this.zms.size(); j++)
      {
        localObject1 = (String)this.zms.get(j);
        localObject2 = new j(getContext(), (String)localObject1);
        this.mpt.addView((View)localObject2);
        this.zmt.put(localObject1, localObject2);
        if (j == this.zms.size() - 1)
          ((j)localObject2).findViewById(2131823612).setBackgroundResource(2130839162);
      }
      AppMethodBeat.o(33706);
    }
  }

  public final void a(e.a.b paramb)
  {
    AppMethodBeat.i(33707);
    if (paramb.fwl == null)
      AppMethodBeat.o(33707);
    while (true)
    {
      return;
      if (!paramb.fwl.adP())
      {
        ab.i("MicroMsg.EnterpriseBizView", "onEvent, not enterprise father");
        AppMethodBeat.o(33707);
      }
      else
      {
        al.d(new i.1(this, paramb));
        AppMethodBeat.o(33707);
      }
    }
  }

  public final int getEnterpriseFriendCount()
  {
    AppMethodBeat.i(33705);
    int i;
    if (this.zms == null)
    {
      i = 0;
      AppMethodBeat.o(33705);
    }
    while (true)
    {
      return i;
      i = this.zms.size();
      AppMethodBeat.o(33705);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.i
 * JD-Core Version:    0.6.2
 */