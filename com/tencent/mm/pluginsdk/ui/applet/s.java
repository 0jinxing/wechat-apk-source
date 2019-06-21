package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.b;
import com.tencent.mm.openim.b.o;
import com.tencent.mm.protocal.protobuf.bgf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.a.c;
import java.util.LinkedList;
import junit.framework.Assert;

public final class s
  implements f
{
  String content;
  Context context;
  View gub;
  c gud;
  LinkedList<Integer> pAT;
  TextView pCu;
  EditText pwu;
  com.tencent.mm.ui.base.p tipDialog;
  private LinkedList<String> vjJ;
  String vjK;
  s.a vlk;
  LinkedList<String> vll;
  boolean vlm;
  private boolean vln;

  public s(Context paramContext, s.a parama)
  {
    AppMethodBeat.i(79794);
    this.gud = null;
    this.content = "";
    this.vlm = true;
    this.vjJ = new LinkedList();
    this.vln = false;
    this.context = paramContext;
    this.vlk = parama;
    AppMethodBeat.o(79794);
  }

  public final void a(LinkedList<String> paramLinkedList1, LinkedList<Integer> paramLinkedList, LinkedList<String> paramLinkedList2)
  {
    AppMethodBeat.i(79798);
    boolean bool;
    if (paramLinkedList1.size() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (paramLinkedList.size() <= 0)
        break label316;
      bool = true;
      label30: Assert.assertTrue(bool);
      onStart();
      this.vll = paramLinkedList1;
      this.pAT = paramLinkedList;
      this.vjJ = paramLinkedList2;
      this.gub = View.inflate(this.context, 2130970617, null);
      if (this.vjK != null)
        break label322;
      bool = true;
      label78: if (this.vjK != null)
        break label328;
    }
    label316: label322: label328: for (int i = 0; ; i = this.vjK.length())
    {
      ab.i("MicroMsg.SendVerifyRequest", "verifyTip is null: %b, length : %d, value : [%s]", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i), this.vjK });
      if (!bo.isNullOrNil(this.vjK))
        ((TextView)this.gub.findViewById(2131827352)).setText(this.vjK);
      this.pwu = ((EditText)this.gub.findViewById(2131827353));
      this.pCu = ((TextView)this.gub.findViewById(2131823129));
      this.pCu.setVisibility(0);
      this.pwu.setText(null);
      this.pCu.setText("50");
      this.pwu.setFilters(com.tencent.mm.pluginsdk.ui.tools.g.vuR);
      this.pwu.addTextChangedListener(new s.1(this));
      paramLinkedList = new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(79790);
          if (s.this.gud != null)
          {
            s.this.gud.dismiss();
            s.this.gud = null;
          }
          new ap(new s.2.1(this), false).ae(500L, 500L);
          AppMethodBeat.o(79790);
        }
      };
      paramLinkedList1 = new s.3(this);
      this.gud = com.tencent.mm.ui.base.h.a(this.context, this.context.getString(2131302966), this.gub, paramLinkedList, paramLinkedList1);
      if (this.gud == null)
        onStop();
      this.pwu.post(new s.4(this));
      AppMethodBeat.o(79798);
      return;
      bool = false;
      break;
      bool = false;
      break label30;
      bool = false;
      break label78;
    }
  }

  final void djH()
  {
    AppMethodBeat.i(79799);
    if (this.vjJ.isEmpty())
    {
      this.vln = true;
      com.tencent.mm.kernel.g.RO().eJo.a(881, this);
      com.tencent.mm.kernel.g.RO().eJo.a(new com.tencent.mm.openim.b.h((String)this.vll.getFirst(), "", ""), 0);
      AppMethodBeat.o(79799);
    }
    while (true)
    {
      return;
      com.tencent.mm.kernel.g.RO().eJo.a(new o((String)this.vll.getFirst(), this.content, (String)this.vjJ.getFirst()), 0);
      AppMethodBeat.o(79799);
    }
  }

  public final void g(LinkedList<String> paramLinkedList, LinkedList<Integer> paramLinkedList1)
  {
    AppMethodBeat.i(79797);
    a(paramLinkedList, paramLinkedList1, new LinkedList());
    AppMethodBeat.o(79797);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(79800);
    if (paramm.getType() == 881)
    {
      com.tencent.mm.kernel.g.RO().eJo.b(881, this);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (this.vln)
        {
          paramString = ((com.tencent.mm.openim.b.h)paramm).gfb.vEP;
          com.tencent.mm.kernel.g.RO().eJo.a(new o((String)this.vll.getFirst(), this.content, paramString), 0);
        }
        this.vln = false;
        AppMethodBeat.o(79800);
      }
    }
    while (true)
    {
      return;
      Toast.makeText(this.context, this.context.getString(2131302960), 1).show();
      break;
      if ((paramm.getType() != 30) && (paramm.getType() != 243))
      {
        ab.w("MicroMsg.SendVerifyRequest", "not expected scene,  type = " + paramm.getType());
        AppMethodBeat.o(79800);
      }
      else
      {
        ab.d("MicroMsg.SendVerifyRequest", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
        if (this.tipDialog != null)
        {
          this.tipDialog.dismiss();
          this.tipDialog = null;
        }
        onStop();
        if ((paramInt1 != 0) || (paramInt2 != 0))
          break label285;
        if (this.vlm)
          com.tencent.mm.ui.base.h.bQ(this.context, this.context.getString(2131302961));
        this.vlk.bD(true);
        AppMethodBeat.o(79800);
      }
    }
    label285: if ((paramInt1 == 4) && (paramInt2 == -34))
      paramm = this.context.getString(2131299915);
    while (true)
    {
      if (this.vlm)
        Toast.makeText(this.context, paramm, 1).show();
      this.vlk.bD(false);
      AppMethodBeat.o(79800);
      break;
      if ((paramInt1 == 4) && (paramInt2 == -94))
      {
        paramm = this.context.getString(2131299918);
      }
      else if ((paramInt1 == 4) && (paramInt2 == -24))
      {
        paramm = paramString;
        if (!bo.isNullOrNil(paramString));
      }
      else if (paramInt1 == 4)
      {
        paramm = paramString;
        if (!bo.isNullOrNil(paramString));
      }
      else
      {
        paramm = this.context.getString(2131302960);
      }
    }
  }

  final void onStart()
  {
    AppMethodBeat.i(79795);
    com.tencent.mm.kernel.g.RO().eJo.a(30, this);
    com.tencent.mm.kernel.g.RO().eJo.a(243, this);
    AppMethodBeat.o(79795);
  }

  final void onStop()
  {
    AppMethodBeat.i(79796);
    com.tencent.mm.kernel.g.RO().eJo.b(30, this);
    com.tencent.mm.kernel.g.RO().eJo.b(243, this);
    if (this.gud != null)
    {
      this.gud.dismiss();
      this.gud = null;
    }
    AppMethodBeat.o(79796);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.s
 * JD-Core Version:    0.6.2
 */