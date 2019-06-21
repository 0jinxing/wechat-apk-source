package com.samsung.android.sdk.look.airbutton;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.samsung.android.sdk.look.Slook;
import com.samsung.android.sdk.look.SlookResourceManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public final class SlookAirButtonFrequentContactAdapter extends SlookAirButtonAdapter
{
  public static final String DATA = "data";
  public static final String DISPLAY_NAME = "display_name";
  private static final String EMAIL = "vnd.android.cursor.item/email_v2";
  private static final String FREQUENT_URI = "content://com.android.contacts/contacts/frequent_data";
  public static final String ID = "id";
  public static final String LOOKUP_KEY = "lookup_key";
  private static final String MIME_TYPE = "MIME_TYPE";
  private static final String PHONE = "vnd.android.cursor.item/phone_v2";
  public static final String PHOTO = "photo";
  public static final String PHOTO_URI = "photo_uri";
  private static final String TAG = "AirButtonFrequentContactAdapter";
  private boolean DEBUG;
  private final String EXTRA_CONDITION;
  private final String IS_PRIVATE;
  private Context mContext;
  private int mCount;
  private ArrayList<Bundle> mData;
  private boolean mIsShowing;
  private int mMaxCount;
  private boolean mNeedUpdate;
  private StringBuilder mSelectionSb;
  private Slook mSlook;

  public SlookAirButtonFrequentContactAdapter(View paramView, Bundle paramBundle)
  {
    AppMethodBeat.i(117235);
    this.IS_PRIVATE = "is_private";
    this.EXTRA_CONDITION = "extra_condition";
    this.mData = new ArrayList();
    this.mSlook = new Slook();
    this.mMaxCount = 15;
    this.DEBUG = false;
    this.mIsShowing = false;
    this.mNeedUpdate = true;
    this.mCount = 0;
    if ((paramView == null) && (paramBundle == null))
    {
      paramView = new IllegalArgumentException("You should set the View and Bundle in Param");
      AppMethodBeat.o(117235);
      throw paramView;
    }
    if (!isSupport(1))
    {
      AppMethodBeat.o(117235);
      return;
    }
    if (paramBundle != null)
    {
      String str = paramBundle.getString("MIME_TYPE");
      this.mSelectionSb = new StringBuilder();
      if (str == null)
        break label310;
      this.mSelectionSb.append("view_data.");
      this.mSelectionSb.append("mimetype");
      this.mSelectionSb.append("='");
      this.mSelectionSb.append(str);
      this.mSelectionSb.append("'");
    }
    label310: for (int i = 1; ; i = 0)
    {
      boolean bool = paramBundle.getBoolean("PRIVATE", false);
      if (!bool)
      {
        if (i != 0)
          this.mSelectionSb.append(" and ");
        this.mSelectionSb.append("is_private=0");
      }
      paramBundle = paramBundle.getString("extra_condition");
      if (paramBundle != null)
      {
        if ((i != 0) || (!bool))
          this.mSelectionSb.append(" and ");
        this.mSelectionSb.append(paramBundle);
      }
      this.mMaxCount = SlookResourceManager.getInt(2);
      this.DEBUG = true;
      if (paramView != null)
      {
        this.mContext = paramView.getContext();
        setEmptyText(SlookResourceManager.getText(this.mContext, 0));
      }
      AppMethodBeat.o(117235);
      break;
    }
  }

  private boolean isSupport(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(117241);
    if (this.mSlook.isFeatureEnabled(1))
      AppMethodBeat.o(117241);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(117241);
    }
  }

  private void updateData()
  {
    while (true)
    {
      Object localObject1;
      try
      {
        AppMethodBeat.i(117240);
        if ((!this.mNeedUpdate) || (this.mIsShowing))
        {
          AppMethodBeat.o(117240);
          return;
        }
        this.mNeedUpdate = false;
        this.mData.clear();
        Uri localUri = Uri.parse("content://com.android.contacts/contacts/frequent_data");
        localObject1 = this.mContext.getContentResolver();
        if (this.mSelectionSb != null)
        {
          Object localObject3 = this.mSelectionSb.toString();
          Object localObject6 = new java/lang/StringBuilder;
          ((StringBuilder)localObject6).<init>("_id LIMIT ");
          localObject6 = this.mMaxCount;
          localObject3 = ((ContentResolver)localObject1).query(localUri, new String[] { "_id", "display_name", "photo_uri", "data15", "lookup", "mimetype", "data1", "is_private" }, (String)localObject3, null, (String)localObject6);
          if (localObject3 != null)
            break label175;
          AppMethodBeat.o(117240);
          continue;
        }
      }
      finally
      {
      }
      Object localObject5 = null;
      continue;
      while (true)
      {
        try
        {
          label175: if (!localObject5.moveToNext())
            break;
          localObject1 = new android/os/Bundle;
          ((Bundle)localObject1).<init>();
          ((Bundle)localObject1).putInt("id", localObject5.getInt(0));
          ((Bundle)localObject1).putString("display_name", localObject5.getString(1));
          ((Bundle)localObject1).putString("photo_uri", localObject5.getString(2));
          ((Bundle)localObject1).putByteArray("photo", localObject5.getBlob(3));
          ((Bundle)localObject1).putString("lookup_key", localObject5.getString(4));
          ((Bundle)localObject1).putString("MIME_TYPE", localObject5.getString(5));
          ((Bundle)localObject1).putString("data", localObject5.getString(6));
          if (localObject5.getInt(7) == 1)
          {
            bool = true;
            ((Bundle)localObject1).putBoolean("is_private", bool);
            this.mData.add(localObject1);
            continue;
          }
        }
        finally
        {
          if (localObject5 != null)
            localObject5.close();
          AppMethodBeat.o(117240);
        }
        boolean bool = false;
      }
      if (localObject5 != null)
        localObject5.close();
      try
      {
        this.mCount = this.mData.size();
        AppMethodBeat.o(117240);
      }
      catch (NoSuchMethodError localNoSuchMethodError)
      {
        AppMethodBeat.o(117240);
      }
    }
  }

  public final int getCount()
  {
    return this.mCount;
  }

  public final SlookAirButtonAdapter.AirButtonItem getItem(int paramInt)
  {
    AppMethodBeat.i(117239);
    Bundle localBundle = (Bundle)this.mData.get(paramInt);
    String str1 = localBundle.getString("display_name");
    String str2 = localBundle.getString("data");
    Object localObject = localBundle.getByteArray("photo");
    if (localObject == null)
      paramInt = SlookResourceManager.getDrawableId(1);
    for (localObject = this.mContext.getResources().getDrawable(paramInt); ; localObject = new BitmapDrawable(this.mContext.getResources(), BitmapFactory.decodeByteArray((byte[])localObject, 0, localObject.length)))
    {
      localObject = new SlookAirButtonAdapter.AirButtonItem((Drawable)localObject, str1, str2, localBundle);
      AppMethodBeat.o(117239);
      return localObject;
    }
  }

  public final void onDismiss(View paramView)
  {
    AppMethodBeat.i(117238);
    this.mIsShowing = false;
    this.mNeedUpdate = true;
    this.mData.clear();
    super.onDismiss(paramView);
    AppMethodBeat.o(117238);
  }

  public final void onHide(View paramView)
  {
    AppMethodBeat.i(117237);
    this.mIsShowing = false;
    this.mNeedUpdate = true;
    this.mData.clear();
    super.onHide(paramView);
    AppMethodBeat.o(117237);
  }

  public final void onShow(View paramView)
  {
    AppMethodBeat.i(117236);
    updateData();
    this.mIsShowing = true;
    super.onShow(paramView);
    AppMethodBeat.o(117236);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.samsung.android.sdk.look.airbutton.SlookAirButtonFrequentContactAdapter
 * JD-Core Version:    0.6.2
 */