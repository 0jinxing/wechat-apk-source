package com.tencent.mm.plugin.recharge.ui.form;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.recharge.model.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c$b
{
  public List<String[]> pGw;
  public com.tencent.mm.plugin.recharge.model.a pGx = null;
  public MallFormView pIg = null;
  public d pIh;
  boolean pIi = false;

  public c$b(MallFormView paramMallFormView)
  {
    this.pIg = paramMallFormView;
  }

  public final void kd(boolean paramBoolean)
  {
    AppMethodBeat.i(44373);
    ab.d(c.access$100(), "needSetInput: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    Object localObject1 = com.tencent.mm.plugin.recharge.a.a.cea().ceb();
    Object localObject2;
    Object localObject3;
    if (localObject1 == null)
    {
      localObject2 = new ArrayList();
      localObject3 = com.tencent.mm.plugin.recharge.a.a.cec();
      localObject1 = localObject2;
      if (localObject3 != null)
      {
        ((List)localObject2).add(localObject3);
        com.tencent.mm.plugin.recharge.a.a.cea().a((com.tencent.mm.plugin.recharge.model.a)localObject3);
        localObject1 = localObject2;
      }
    }
    while (true)
    {
      this.pIh.cK((List)localObject1);
      if ((localObject1 != null) && (((List)localObject1).size() > 0) && (paramBoolean))
      {
        this.pGx = ((com.tencent.mm.plugin.recharge.model.a)((List)localObject1).get(0));
        setInput(this.pGx);
      }
      AppMethodBeat.o(44373);
      return;
      String str = (String)g.RP().Ry().get(6, null);
      int i = 0;
      if (i < ((List)localObject1).size())
      {
        localObject2 = (com.tencent.mm.plugin.recharge.model.a)((List)localObject1).get(i);
        if ((!bo.isNullOrNil(((com.tencent.mm.plugin.recharge.model.a)localObject2).pFM)) && (((com.tencent.mm.plugin.recharge.model.a)localObject2).pFM.equals(str)))
          if ((bo.isNullOrNil(((com.tencent.mm.plugin.recharge.model.a)localObject2).name)) || (!((com.tencent.mm.plugin.recharge.model.a)localObject2).name.equals(this.pIg.getContext().getString(2131305280))))
          {
            ((com.tencent.mm.plugin.recharge.model.a)localObject2).name = this.pIg.getContext().getString(2131305280);
            label240: break label292;
          }
        while (true)
        {
          com.tencent.mm.plugin.recharge.a.a.cea().cK((List)localObject1);
          do
          {
            i++;
            break;
          }
          while ((bo.isNullOrNil(((com.tencent.mm.plugin.recharge.model.a)localObject2).pFM)) || (!bo.isNullOrNil(((com.tencent.mm.plugin.recharge.model.a)localObject2).name)) || (this.pGw == null));
          Iterator localIterator = this.pGw.iterator();
          label292: if (localIterator.hasNext())
          {
            localObject3 = (String[])localIterator.next();
            if (!((com.tencent.mm.plugin.recharge.model.a)localObject2).pFM.equals(b.ws(localObject3[2])))
              break label240;
            ((com.tencent.mm.plugin.recharge.model.a)localObject2).name = localObject3[1];
            ab.i(c.access$100(), "add name: %s", new Object[] { localObject3[1] });
          }
        }
      }
    }
  }

  public final void setInput(com.tencent.mm.plugin.recharge.model.a parama)
  {
    AppMethodBeat.i(44372);
    this.pGx = parama;
    Context localContext;
    if (parama != null)
    {
      if ((bo.isNullOrNil(this.pIg.getText())) || (!this.pIg.getText().equals(parama.pFM)))
        this.pIg.getContentEditText().setText(b.VB(parama.pFM));
      this.pIg.getContentEditText().setSelection(this.pIg.getContentEditText().getText().length());
      ab.d(c.access$100(), "editTv.setText %s, name: %s, location: %s, type: %s", new Object[] { parama.pFM, parama.name, parama.pFN, Integer.valueOf(parama.cvp) });
      localContext = this.pIg.getContext();
      if (this.pGx.cvp == 3)
      {
        this.pIg.getTipsTv().setText(this.pGx.name);
        this.pIg.getTipsTv().setTextColor(localContext.getResources().getColor(2131690375));
        AppMethodBeat.o(44372);
      }
    }
    while (true)
    {
      return;
      if (this.pGx.cvp == 1)
      {
        String str;
        if (!bo.isNullOrNil(this.pGx.name))
        {
          str = this.pGx.name;
          parama = str;
          if (!bo.isNullOrNil(this.pGx.pFN))
            parama = str + localContext.getString(2131305272, new Object[] { this.pGx.pFN });
          this.pIg.getTipsTv().setText(parama);
          this.pIg.getTipsTv().setTextColor(localContext.getResources().getColor(2131690316));
          AppMethodBeat.o(44372);
        }
        else
        {
          str = localContext.getString(2131305282);
          parama = str;
          if (!bo.isNullOrNil(this.pGx.pFN))
            parama = str + localContext.getString(2131305272, new Object[] { this.pGx.pFN });
          this.pIg.getTipsTv().setText(parama);
          this.pIg.getTipsTv().setTextColor(localContext.getResources().getColor(2131690367));
          AppMethodBeat.o(44372);
        }
      }
      else if (this.pGx.cvp == 2)
      {
        if (!bo.isNullOrNil(this.pGx.pFN))
        {
          this.pIg.getTipsTv().setText(this.pGx.pFN);
          this.pIg.getTipsTv().setTextColor(localContext.getResources().getColor(2131690316));
          AppMethodBeat.o(44372);
        }
        else
        {
          this.pIg.getTipsTv().setText("");
          this.pIg.getTipsTv().setTextColor(localContext.getResources().getColor(2131690367));
          AppMethodBeat.o(44372);
        }
      }
      else if (this.pGx.cvp == 0)
      {
        if (!bo.isNullOrNil(this.pGx.pFN))
        {
          if (!bo.isNullOrNil(this.pGx.name))
          {
            this.pIg.getTipsTv().setText(this.pGx.name + localContext.getString(2131305272, new Object[] { this.pGx.pFN }));
            this.pIg.getTipsTv().setTextColor(localContext.getResources().getColor(2131690367));
            AppMethodBeat.o(44372);
          }
          else
          {
            this.pIg.getTipsTv().setText(this.pGx.pFN);
            this.pIg.getTipsTv().setTextColor(localContext.getResources().getColor(2131690316));
            AppMethodBeat.o(44372);
          }
        }
        else if (!bo.isNullOrNil(this.pGx.name))
        {
          this.pIg.getTipsTv().setText(this.pGx.name);
          this.pIg.getTipsTv().setTextColor(localContext.getResources().getColor(2131690367));
          AppMethodBeat.o(44372);
        }
        else
        {
          this.pIg.getTipsTv().setText("");
          this.pIg.getTipsTv().setTextColor(localContext.getResources().getColor(2131690316));
        }
      }
      else
      {
        AppMethodBeat.o(44372);
        continue;
        this.pIg.getContentEditText().setText("");
        ab.d(c.access$100(), "editTv.setText null");
        this.pIg.getTipsTv().setText("");
        AppMethodBeat.o(44372);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.form.c.b
 * JD-Core Version:    0.6.2
 */