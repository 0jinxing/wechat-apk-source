package com.tencent.mm.chatroom.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class DelChatroomMemberUI$a extends BaseAdapter
{
  List<ad> ejk;

  DelChatroomMemberUI$a(DelChatroomMemberUI paramDelChatroomMemberUI)
  {
    AppMethodBeat.i(104090);
    this.ejk = new LinkedList();
    AppMethodBeat.o(104090);
  }

  public final void P(List<String> paramList)
  {
    AppMethodBeat.i(104091);
    if (paramList != null)
    {
      ab.i("MicroMsg.DelChatroomMemberAdapter", "initData members.size %d", new Object[] { Integer.valueOf(paramList.size()) });
      this.ejk.clear();
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        String str = (String)paramList.next();
        ad localad = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(str);
        if ((localad != null) && (!bo.isNullOrNil(localad.field_username)) && (localad.field_username.equals(str)))
          this.ejk.add(localad);
      }
    }
    AppMethodBeat.o(104091);
  }

  public final String c(ad paramad)
  {
    AppMethodBeat.i(104095);
    if (!bo.isNullOrNil(paramad.field_conRemark));
    for (Object localObject1 = paramad.field_conRemark; ; localObject1 = DelChatroomMemberUI.b(this.ejg, paramad.field_username))
    {
      Object localObject2 = localObject1;
      if (bo.isNullOrNil((String)localObject1))
        localObject2 = paramad.field_conRemark;
      localObject1 = localObject2;
      if (bo.isNullOrNil((String)localObject2))
        localObject1 = paramad.Oi();
      AppMethodBeat.o(104095);
      return localObject1;
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(104092);
    int i = this.ejk.size();
    AppMethodBeat.o(104092);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(104093);
    Object localObject = this.ejk.get(paramInt);
    AppMethodBeat.o(104093);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(104094);
    if (paramView == null)
    {
      paramView = View.inflate(this.ejg, 2130969007, null);
      paramViewGroup = new DelChatroomMemberUI.b(this.ejg);
      paramViewGroup.ejo = ((ImageView)paramView.findViewById(2131822363));
      paramViewGroup.ejp = ((TextView)paramView.findViewById(2131822365));
      paramViewGroup.ejq = ((TextView)paramView.findViewById(2131822364));
      paramViewGroup.ejq.setOnClickListener(new DelChatroomMemberUI.a.1(this));
      paramView.setTag(paramViewGroup);
    }
    while (true)
    {
      paramViewGroup.ejq.setTag(Integer.valueOf(paramInt));
      ad localad = (ad)getItem(paramInt);
      String str = c(localad);
      paramViewGroup.ejp.setText(str);
      com.tencent.mm.pluginsdk.ui.e.j.b(this.ejg, str, paramViewGroup.ejp.getTextSize());
      a.b.b(paramViewGroup.ejo, localad.field_username);
      AppMethodBeat.o(104094);
      return paramView;
      paramViewGroup = (DelChatroomMemberUI.b)paramView.getTag();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.DelChatroomMemberUI.a
 * JD-Core Version:    0.6.2
 */