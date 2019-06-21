package com.tencent.mm.ui.conversation;

import android.content.Context;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.o;
import com.tencent.mm.af.p;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.biz.a.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.p.a;
import java.util.HashMap;
import java.util.LinkedList;

final class NewBizConversationUI$a extends e
{
  private String cIe;
  HashMap<String, NewBizConversationUI.b> jOf;

  public NewBizConversationUI$a(Context paramContext, String paramString, p.a parama)
  {
    super(paramContext, parama);
    AppMethodBeat.i(34554);
    this.cIe = paramString;
    this.jOf = new HashMap();
    AppMethodBeat.o(34554);
  }

  public final void KC()
  {
    AppMethodBeat.i(34555);
    aw.ZK();
    setCursor(c.XR().c(t.fkP, this.elZ, this.cIe));
    if (this.yle != null)
      this.yle.apt();
    super.notifyDataSetChanged();
    AppMethodBeat.o(34555);
  }

  public final void a(ak paramak, int paramInt)
  {
    AppMethodBeat.i(34557);
    aw.ZK();
    a(paramak, c.XR().g(paramak), paramInt, true);
    AppMethodBeat.o(34557);
  }

  protected final void a(ak paramak, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    AppMethodBeat.i(34556);
    if (paramak == null)
    {
      AppMethodBeat.o(34556);
      return;
    }
    NewBizConversationUI.b localb = (NewBizConversationUI.b)this.jOf.get(paramak.field_username);
    if (localb == null)
    {
      localb = new NewBizConversationUI.b((byte)0);
      this.jOf.put(paramak.field_username, localb);
    }
    while (true)
    {
      while (true)
      {
        if (localb.fPZ > 0)
        {
          AppMethodBeat.o(34556);
          break;
        }
        localb.wTL = paramBoolean1;
        if ((localb.wTO) || (paramak.field_unReadCount > 0));
        for (paramBoolean1 = true; ; paramBoolean1 = false)
        {
          localb.wTO = paramBoolean1;
          localb.ndr = (paramInt + 1);
          if (paramBoolean2)
            localb.fPZ = localb.ndr;
          localb.wTN = ((int)(System.currentTimeMillis() / 1000L));
          if (paramak.field_lastSeq != localb.wYf)
            break label167;
          AppMethodBeat.o(34556);
          break;
        }
        label167: localb.wYf = paramak.field_lastSeq;
        paramak = ((j)g.K(j.class)).bOr().Rb(paramak.field_username);
        if ((paramak != null) && (paramak.drC()))
        {
          paramak = ((a)g.K(a.class)).b(paramak.field_msgId, paramak.field_content);
          if ((paramak != null) && (!bo.ek(paramak.fjr)) && (!bo.isNullOrNil(((p)paramak.fjr.get(0)).url)))
            try
            {
              paramak = Uri.parse(((p)paramak.fjr.get(0)).url);
              localb.wTJ = bo.getLong(paramak.getQueryParameter("mid"), 0L);
              localb.wTK = bo.getInt(paramak.getQueryParameter("idx"), 0);
              AppMethodBeat.o(34556);
            }
            catch (UnsupportedOperationException paramak)
            {
              ab.w("MicroMsg.ConversationAdapter", "exposeLog exp %s", new Object[] { paramak.getMessage() });
              AppMethodBeat.o(34556);
            }
            catch (Exception paramak)
            {
              ab.w("MicroMsg.ConversationAdapter", "exposeLog exp %s", new Object[] { paramak.getMessage() });
            }
        }
      }
      AppMethodBeat.o(34556);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.NewBizConversationUI.a
 * JD-Core Version:    0.6.2
 */