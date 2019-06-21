package com.tencent.mm.plugin.subapp.ui.openapi;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.R.a;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.ui.base.MMGridView;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.List;

public class ServicePreference extends Preference
{
  private Context context;
  private boolean ogU;
  List<f> qnw;
  private AdapterView.OnItemClickListener suA;
  private View.OnClickListener suB;
  private int suC;
  private int suD;
  b suS;
  AdapterView.OnItemClickListener suz;

  public ServicePreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public ServicePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ServicePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(25485);
    this.suz = null;
    this.suA = null;
    this.suB = null;
    this.ogU = false;
    this.suD = 0;
    this.context = paramContext;
    setLayoutResource(2130968756);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.a.AppPreference);
    this.suC = paramContext.getInt(0, 8);
    this.ogU = paramContext.getBoolean(1, false);
    this.suD = paramContext.getResourceId(2, 0);
    paramContext.recycle();
    AppMethodBeat.o(25485);
  }

  public final f Fq(int paramInt)
  {
    AppMethodBeat.i(25487);
    f localf;
    if ((paramInt < 0) || (paramInt >= this.suS.getCount()))
    {
      localf = null;
      AppMethodBeat.o(25487);
    }
    while (true)
    {
      return localf;
      localf = (f)this.suS.getItem(paramInt);
      AppMethodBeat.o(25487);
    }
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(25486);
    super.onBindView(paramView);
    MMGridView localMMGridView = (MMGridView)paramView.findViewById(2131821456);
    if (localMMGridView == null)
    {
      AppMethodBeat.o(25486);
      return;
    }
    this.suS = new b(this.context, this.qnw);
    am.bYJ().d(this.suS);
    am.bYJ().c(this.suS);
    localMMGridView.setAdapter(this.suS);
    localMMGridView.setOnItemClickListener(new ServicePreference.1(this));
    if (this.ogU)
      localMMGridView.setOnItemLongClickListener(new ServicePreference.2(this));
    TextView localTextView = (TextView)paramView.findViewById(2131821457);
    if (this.suS.getCount() == 0)
    {
      localTextView.setVisibility(0);
      localTextView.setText(this.suD);
      localMMGridView.setVisibility(8);
    }
    while (true)
    {
      paramView = (Button)paramView.findViewById(2131821458);
      paramView.setVisibility(this.suC);
      paramView.setOnClickListener(this.suB);
      AppMethodBeat.o(25486);
      break;
      localTextView.setVisibility(8);
      localMMGridView.setVisibility(0);
    }
  }

  public final void onPause()
  {
    AppMethodBeat.i(25489);
    if (this.suS != null)
      am.bYJ().d(this.suS);
    AppMethodBeat.o(25489);
  }

  public final void onResume()
  {
    AppMethodBeat.i(25488);
    if (this.suS != null)
      am.bYJ().c(this.suS);
    AppMethodBeat.o(25488);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.openapi.ServicePreference
 * JD-Core Version:    0.6.2
 */