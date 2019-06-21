package com.tencent.mm.plugin.location.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q.b;
import java.util.ArrayList;

public class LocationExtUI extends MMActivity
{
  private ArrayList<String> lfx;
  private TextView nLx;
  private TextView nLy;
  private String nLz;

  public LocationExtUI()
  {
    AppMethodBeat.i(113435);
    this.lfx = new ArrayList();
    AppMethodBeat.o(113435);
  }

  public final int getLayoutId()
  {
    return 2130969943;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(113437);
    if (4097 == paramInt1)
      if ((-1 != paramInt2) || (paramIntent == null))
        AppMethodBeat.o(113437);
    while (true)
    {
      return;
      paramIntent = paramIntent.getCharSequenceExtra("key_result");
      if (paramIntent == null);
      for (paramIntent = ""; ; paramIntent = paramIntent.toString())
      {
        this.nLz = paramIntent;
        this.nLy.setText(this.nLz);
        AppMethodBeat.o(113437);
        break;
      }
      if (4098 == paramInt1)
      {
        if ((-1 != paramInt2) || (paramIntent == null))
        {
          AppMethodBeat.o(113437);
        }
        else
        {
          this.lfx.clear();
          String[] arrayOfString = paramIntent.getStringArrayExtra("key_fav_result_array");
          if ((arrayOfString == null) || (arrayOfString.length <= 0))
          {
            AppMethodBeat.o(113437);
          }
          else
          {
            paramIntent = arrayOfString[0];
            this.lfx.add(arrayOfString[0]);
            String str = getResources().getString(2131299752);
            for (paramInt1 = 1; paramInt1 < arrayOfString.length; paramInt1++)
            {
              this.lfx.add(arrayOfString[paramInt1]);
              paramIntent = paramIntent + str + arrayOfString[paramInt1];
            }
            this.nLx.setText(paramIntent);
            AppMethodBeat.o(113437);
          }
        }
      }
      else
      {
        super.onActivityResult(paramInt1, paramInt2, paramIntent);
        AppMethodBeat.o(113437);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(113436);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("Kwebmap_locaion");
    if (bo.isNullOrNil(paramBundle))
      findViewById(2131825268).setVisibility(8);
    while (true)
    {
      this.nLx = ((TextView)findViewById(2131825267));
      this.nLy = ((TextView)findViewById(2131825266));
      this.nLx.setOnClickListener(new LocationExtUI.1(this));
      this.nLy.setOnClickListener(new LocationExtUI.2(this));
      a(0, getString(2131296944), new LocationExtUI.3(this), q.b.ymu);
      setBackBtn(new LocationExtUI.4(this));
      AppMethodBeat.o(113436);
      return;
      ((TextView)findViewById(2131825269)).setText(paramBundle);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.LocationExtUI
 * JD-Core Version:    0.6.2
 */