package com.tencent.mm.plugin.subapp.ui.openapi;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
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

public class AppPreference extends Preference
{
  private Context context;
  private boolean ogU;
  AdapterView.OnItemClickListener suA;
  private View.OnClickListener suB;
  private int suC;
  private int suD;
  int suw;
  a suy;
  AdapterView.OnItemClickListener suz;

  public AppPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public AppPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(25443);
    this.suz = null;
    this.suA = null;
    this.suB = null;
    this.suw = 0;
    this.ogU = false;
    this.suD = 0;
    this.context = paramContext;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.a.AppPreference);
    this.suC = paramContext.getInt(0, 8);
    this.ogU = paramContext.getBoolean(1, false);
    this.suD = paramContext.getResourceId(2, 0);
    paramContext.recycle();
    AppMethodBeat.o(25443);
  }

  public final f Fq(int paramInt)
  {
    AppMethodBeat.i(25445);
    f localf;
    if ((paramInt < 0) || (paramInt >= this.suy.getCount()))
    {
      localf = null;
      AppMethodBeat.o(25445);
    }
    while (true)
    {
      return localf;
      localf = (f)this.suy.getItem(paramInt);
      AppMethodBeat.o(25445);
    }
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(25444);
    super.onBindView(paramView);
    MMGridView localMMGridView = (MMGridView)paramView.findViewById(2131821456);
    this.suy = new a(this.context, this.suw);
    localMMGridView.setAdapter(this.suy);
    localMMGridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        AppMethodBeat.i(25441);
        if (AppPreference.a(AppPreference.this).wK(paramAnonymousInt))
        {
          AppPreference.a(AppPreference.this).lX(false);
          AppMethodBeat.o(25441);
        }
        while (true)
        {
          return;
          if (AppPreference.a(AppPreference.this).suv)
          {
            if (AppPreference.b(AppPreference.this) != null)
            {
              AppPreference.b(AppPreference.this).onItemClick(paramAnonymousAdapterView, paramAnonymousView, paramAnonymousInt, paramAnonymousLong);
              AppMethodBeat.o(25441);
            }
          }
          else
          {
            if (AppPreference.c(AppPreference.this) != null)
              AppPreference.c(AppPreference.this).onItemClick(paramAnonymousAdapterView, paramAnonymousView, paramAnonymousInt, paramAnonymousLong);
            AppMethodBeat.o(25441);
          }
        }
      }
    });
    if (this.ogU)
      localMMGridView.setOnItemLongClickListener(new AppPreference.2(this));
    TextView localTextView = (TextView)paramView.findViewById(2131821457);
    if (this.suy.getCount() == 0)
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
      AppMethodBeat.o(25444);
      return;
      localTextView.setVisibility(8);
      localMMGridView.setVisibility(0);
    }
  }

  public final void onPause()
  {
    AppMethodBeat.i(25447);
    if (this.suy != null)
      am.bYJ().d(this.suy);
    AppMethodBeat.o(25447);
  }

  public final void onResume()
  {
    AppMethodBeat.i(25446);
    if (this.suy != null)
      am.bYJ().c(this.suy);
    AppMethodBeat.o(25446);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.openapi.AppPreference
 * JD-Core Version:    0.6.2
 */