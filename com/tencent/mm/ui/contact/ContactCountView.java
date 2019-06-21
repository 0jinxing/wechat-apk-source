package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bd;

public class ContactCountView extends FrameLayout
{
  private boolean aIB;
  private int count;
  private View gbS;
  private TextView nBf;
  private int zlu;

  public ContactCountView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(33602);
    this.count = 0;
    this.aIB = true;
    this.zlu = 1;
    init();
    AppMethodBeat.o(33602);
  }

  public ContactCountView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(33601);
    this.count = 0;
    this.aIB = true;
    this.zlu = 1;
    init();
    AppMethodBeat.o(33601);
  }

  private void init()
  {
    AppMethodBeat.i(33603);
    inflate(getContext(), 2130969195, this);
    AppMethodBeat.o(33603);
  }

  public final void dHF()
  {
    AppMethodBeat.i(33605);
    String[] arrayOfString = t.fkY;
    if (this.zlu == 1)
    {
      aw.ZK();
      this.count = c.XM().b(arrayOfString, new String[] { r.Yz(), "weixin", "helper_entry", "filehelper" });
      ab.d("MicroMsg.ContactCountView", "contact count %d", new Object[] { Integer.valueOf(this.count) });
      if (this.nBf != null)
      {
        if (this.zlu != 1)
          break label191;
        this.nBf.setText(getContext().getResources().getQuantityString(2131361793, this.count, new Object[] { Integer.valueOf(this.count) }));
      }
    }
    while (true)
    {
      setVisible(this.aIB);
      AppMethodBeat.o(33605);
      return;
      aw.ZK();
      this.count = c.XM().c(arrayOfString, new String[] { r.Yz(), "weixin", "helper_entry", "filehelper" });
      break;
      label191: this.nBf.setText(getContext().getResources().getQuantityString(2131361792, this.count, new Object[] { Integer.valueOf(this.count) }));
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(33604);
    ab.d("MicroMsg.ContactCountView", "onMeasure");
    if (this.gbS == null)
    {
      this.gbS = ((FrameLayout)findViewById(2131822964));
      this.nBf = ((TextView)findViewById(2131822965));
    }
    dHF();
    super.onMeasure(paramInt1, paramInt2);
    AppMethodBeat.o(33604);
  }

  public void setContactType(int paramInt)
  {
    this.zlu = paramInt;
  }

  public void setVisible(boolean paramBoolean)
  {
    AppMethodBeat.i(33606);
    this.aIB = paramBoolean;
    View localView;
    if (this.gbS != null)
    {
      localView = this.gbS;
      if ((!paramBoolean) || (this.count <= 0))
        break label46;
    }
    label46: for (int i = 0; ; i = 8)
    {
      localView.setVisibility(i);
      AppMethodBeat.o(33606);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ContactCountView
 * JD-Core Version:    0.6.2
 */