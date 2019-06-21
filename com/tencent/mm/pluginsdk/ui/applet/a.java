package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.g.a.jy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.base.h;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class a
  implements f
{
  private String chatroomName;
  private Context context;
  public String gyj;
  private String ijx;
  public int jSW;
  public String mGZ;
  private LinkedList<String> pAS;
  private LinkedList<Integer> pAT;
  private com.tencent.mm.ui.base.p tipDialog;
  private a.a vjH;
  public a.b vjI;
  private LinkedList<String> vjJ;
  public String vjK;
  String vjL;
  private String vjM;
  public boolean vjN;
  public boolean vjO;
  public boolean vjP;
  public String vjQ;

  public a(Context paramContext, a.a parama)
  {
    AppMethodBeat.i(79704);
    this.mGZ = "";
    this.vjL = "";
    this.chatroomName = "";
    this.vjN = true;
    this.vjO = true;
    this.gyj = "";
    this.vjP = false;
    this.vjQ = "";
    this.jSW = 0;
    this.context = paramContext;
    this.vjH = parama;
    this.pAS = new LinkedList();
    this.vjJ = new LinkedList();
    this.tipDialog = null;
    AppMethodBeat.o(79704);
  }

  private void A(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(79714);
    if ((this.vjP) && (!bo.isNullOrNil(paramString)))
      Toast.makeText(this.context, paramString, 1).show();
    while (true)
    {
      c(false, false, this.vjL, this.gyj);
      AppMethodBeat.o(79714);
      return;
      if ((paramInt1 == 4) && (paramInt2 == -22))
        Toast.makeText(this.context, this.context.getString(2131296429), 1).show();
      else if ((paramInt1 == 4) && (paramInt2 == -24) && (!bo.isNullOrNil(paramString)))
        Toast.makeText(this.context, paramString, 1).show();
      else
        Toast.makeText(this.context, this.context.getString(2131296428), 1).show();
    }
  }

  private void a(String paramString1, LinkedList<Integer> paramLinkedList, boolean paramBoolean, String paramString2)
  {
    AppMethodBeat.i(79710);
    boolean bool;
    if ((paramString1 != null) && (paramString1.length() > 0))
    {
      bool = true;
      Assert.assertTrue(bool);
      if (paramLinkedList == null)
        break label168;
      bool = true;
      label31: Assert.assertTrue(bool);
      this.vjN = paramBoolean;
      onStart();
      if (this.vjO)
      {
        Context localContext = this.context;
        this.context.getString(2131297061);
        this.tipDialog = h.b(localContext, this.context.getString(2131298440), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            AppMethodBeat.i(79700);
            a.a(a.this, false, a.this.vjL, a.this.gyj);
            AppMethodBeat.o(79700);
          }
        });
      }
      this.pAT = paramLinkedList;
      this.pAS.add(paramString1);
      this.vjL = paramString1;
      if (!ad.aox(paramString1))
        break label188;
      if (!this.vjJ.isEmpty())
        break label174;
      paramLinkedList = "";
      label134: paramString1 = new com.tencent.mm.openim.b.b(paramString1, paramLinkedList);
      g.RO().eJo.a(paramString1, 0);
      AppMethodBeat.o(79710);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label168: bool = false;
      break label31;
      label174: paramLinkedList = (String)this.vjJ.getFirst();
      break label134;
      label188: paramString1 = new com.tencent.mm.pluginsdk.model.m(1, this.pAS, paramLinkedList, this.vjJ, "", this.mGZ, null, this.chatroomName, paramString2);
      if (!bo.isNullOrNil(this.ijx))
        paramString1.hB(this.ijx, this.vjM);
      paramString1.tq(this.vjQ);
      paramString1.lV(this.jSW);
      g.RO().eJo.a(paramString1, 0);
      AppMethodBeat.o(79710);
    }
  }

  private void c(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2)
  {
    AppMethodBeat.i(79711);
    if (this.vjH != null)
      this.vjH.a(paramBoolean1, paramBoolean2, paramString1, paramString2);
    if (paramBoolean1)
    {
      paramString2 = new jy();
      paramString2.cFk.username = paramString1;
      com.tencent.mm.sdk.b.a.xxA.m(paramString2);
    }
    AppMethodBeat.o(79711);
  }

  private void onStart()
  {
    AppMethodBeat.i(79712);
    g.RO().eJo.a(30, this);
    g.RO().eJo.a(667, this);
    AppMethodBeat.o(79712);
  }

  public final void a(String paramString1, LinkedList<Integer> paramLinkedList, String paramString2)
  {
    AppMethodBeat.i(79707);
    a(paramString1, paramLinkedList, false, paramString2);
    AppMethodBeat.o(79707);
  }

  public final void ajw(String paramString)
  {
    AppMethodBeat.i(79708);
    if (!TextUtils.isEmpty(paramString))
      this.vjJ.add(paramString);
    AppMethodBeat.o(79708);
  }

  public final void b(String paramString, LinkedList<Integer> paramLinkedList, boolean paramBoolean)
  {
    AppMethodBeat.i(79709);
    a(paramString, paramLinkedList, paramBoolean, "");
    AppMethodBeat.o(79709);
  }

  public final void c(String paramString1, String paramString2, LinkedList<Integer> paramLinkedList)
  {
    AppMethodBeat.i(79705);
    this.chatroomName = paramString2;
    a(paramString1, paramLinkedList, false, "");
    AppMethodBeat.o(79705);
  }

  public final void e(String paramString, LinkedList<Integer> paramLinkedList)
  {
    AppMethodBeat.i(79706);
    a(paramString, paramLinkedList, false, "");
    AppMethodBeat.o(79706);
  }

  public final void hH(String paramString1, String paramString2)
  {
    this.ijx = paramString1;
    this.vjM = paramString2;
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(79713);
    ab.d("MicroMsg.AddContact", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2 + "," + paramString);
    if ((paramm.getType() != 30) && (paramm.getType() != 667))
    {
      ab.w("MicroMsg.AddContact", "not expected scene,  type = " + paramm.getType());
      AppMethodBeat.o(79713);
    }
    while (true)
    {
      return;
      if (this.tipDialog != null)
      {
        this.tipDialog.dismiss();
        this.tipDialog = null;
      }
      g.RO().eJo.b(30, this);
      g.RO().eJo.b(667, this);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (paramm.getType() == 30)
          this.vjL = ((com.tencent.mm.pluginsdk.model.m)paramm).dhl();
        while (true)
        {
          c(true, false, this.vjL, this.gyj);
          AppMethodBeat.o(79713);
          break;
          if (paramm.getType() == 667)
            this.vjL = ((com.tencent.mm.openim.b.b)paramm).geZ;
        }
      }
      if (paramInt2 == -44)
      {
        paramm = this.gyj;
        Object localObject;
        if (this.vjI != null)
        {
          localObject = this.vjI;
          if (this.vjJ.isEmpty());
          for (paramString = ""; ; paramString = (String)this.vjJ.getFirst())
          {
            ((a.b)localObject).vQ(paramString);
            c(false, false, this.vjL, paramm);
            AppMethodBeat.o(79713);
            break;
          }
        }
        paramString = new s(this.context, new a.4(this));
        if (this.vjK != null)
          paramString.vjK = this.vjK;
        if (this.vjN)
        {
          localObject = this.pAS;
          paramm = this.pAT;
          paramString.vlm = false;
          paramString.onStart();
          paramString.vll = ((LinkedList)localObject);
          paramString.pAT = paramm;
          if ((((LinkedList)localObject).size() == 1) && (ad.aox((String)((LinkedList)localObject).getFirst())))
          {
            paramString.djH();
            AppMethodBeat.o(79713);
          }
          else
          {
            g.RO().eJo.a(new com.tencent.mm.pluginsdk.model.m(2, (List)localObject, paramm, "", ""), 0);
            AppMethodBeat.o(79713);
          }
        }
        else
        {
          paramString.a(this.pAS, this.pAT, this.vjJ);
          AppMethodBeat.o(79713);
        }
      }
      else if (paramInt2 == -87)
      {
        h.b(this.context, this.context.getString(2131298465), "", true);
        AppMethodBeat.o(79713);
      }
      else if ((paramInt2 == -101) && (!bo.isNullOrNil(paramString)))
      {
        ab.d("MicroMsg.AddContact", "jacks catch add Contact errCode: %d && errMsg: %s", new Object[] { Integer.valueOf(paramInt2), paramString });
        h.a(this.context, paramString, "", false, new a.2(this));
        AppMethodBeat.o(79713);
      }
      else if (paramInt2 == -302)
      {
        if (paramm.getType() == 667)
        {
          AppMethodBeat.o(79713);
        }
        else
        {
          paramInt1 = ((com.tencent.mm.pluginsdk.model.m)paramm).cAd;
          ab.d("MicroMsg.AddContact", "onSceneEnd, verify relation out of date, opCode = %d", new Object[] { Integer.valueOf(paramInt1) });
          if (paramInt1 == 3)
            h.d(this.context, this.context.getString(2131298744), this.context.getString(2131297061), this.context.getString(2131296521), this.context.getString(2131296868), new a.3(this, paramm), null);
          AppMethodBeat.o(79713);
        }
      }
      else if (paramInt2 == -2)
      {
        if (!bo.isNullOrNil(paramString))
        {
          h.a(this.context, paramString, this.context.getString(2131297061), this.context.getString(2131296994), null);
          AppMethodBeat.o(79713);
        }
        else
        {
          A(paramInt1, paramInt2, null);
          AppMethodBeat.o(79713);
        }
      }
      else
      {
        A(paramInt1, paramInt2, paramString);
        AppMethodBeat.o(79713);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.a
 * JD-Core Version:    0.6.2
 */