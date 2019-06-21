package com.tencent.mm.plugin.card.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.d.k;
import com.tencent.mm.protocal.protobuf.oj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import java.util.Iterator;
import java.util.LinkedList;

@a(3)
public class CardViewEntranceUI extends MMActivity
{
  public final int getLayoutId()
  {
    return 2130968895;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(88664);
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    if (paramBundle == null)
    {
      ab.e("MicroMsg.CardViewEntranceUI", "CardViewEntranceUI onCreate() intent == null");
      setResult(0, paramBundle);
      finish();
      AppMethodBeat.o(88664);
    }
    int i;
    String str1;
    String str2;
    LinkedList localLinkedList;
    while (true)
    {
      return;
      i = paramBundle.getIntExtra("key_from_scene", 50);
      ab.i("MicroMsg.CardViewEntranceUI", "CardViewEntranceUI doRediect() handle data");
      str1 = paramBundle.getStringExtra("card_list");
      str2 = paramBundle.getStringExtra("key_app_id");
      ab.d("MicroMsg.CardViewEntranceUI", "appid: %s", new Object[] { str2 });
      if (TextUtils.isEmpty(str1))
      {
        ab.e("MicroMsg.CardViewEntranceUI", "CardViewEntranceUI oncreate card_list is empty");
        setResult(0, paramBundle);
        finish();
        AppMethodBeat.o(88664);
      }
      else
      {
        localLinkedList = k.bR(str1, i);
        if ((localLinkedList != null) && (localLinkedList.size() != 0))
          break;
        ab.e("MicroMsg.CardViewEntranceUI", "CardViewEntranceUI oncreate tempList size is empty");
        setResult(0, paramBundle);
        finish();
        AppMethodBeat.o(88664);
      }
    }
    Object localObject = localLinkedList.iterator();
    while (((Iterator)localObject).hasNext())
      ((oj)((Iterator)localObject).next()).csB = str2;
    localObject = new Intent();
    if (localLinkedList.size() == 1)
    {
      ((Intent)localObject).putExtra("card_list", str1);
      ((Intent)localObject).putExtra("key_from_scene", 50);
      ((Intent)localObject).putExtra("key_previous_scene", i);
      if (!bo.isNullOrNil(paramBundle.getStringExtra("key_template_id")))
        ((Intent)localObject).putExtra("key_template_id", paramBundle.getStringExtra("key_template_id"));
      ((Intent)localObject).putExtra("key_from_appbrand_type", paramBundle.getIntExtra("key_from_appbrand_type", 0));
      ((Intent)localObject).setClass(this, CardDetailUI.class);
      startActivity((Intent)localObject);
    }
    while (true)
    {
      ab.e("MicroMsg.CardViewEntranceUI", "CardViewEntranceUI onCreate() parameter is ok");
      setResult(-1, paramBundle);
      finish();
      AppMethodBeat.o(88664);
      break;
      ((Intent)localObject).putExtra("view_type", 0);
      ((Intent)localObject).putExtra("card_list", str1);
      ((Intent)localObject).putExtra("key_previous_scene", i);
      if (!bo.isNullOrNil(paramBundle.getStringExtra("key_template_id")))
        ((Intent)localObject).putExtra("key_template_id", paramBundle.getStringExtra("key_template_id"));
      ((Intent)localObject).putExtra("key_from_appbrand_type", paramBundle.getIntExtra("key_from_appbrand_type", 0));
      ((Intent)localObject).setClass(this, CardViewUI.class);
      startActivity((Intent)localObject);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardViewEntranceUI
 * JD-Core Version:    0.6.2
 */