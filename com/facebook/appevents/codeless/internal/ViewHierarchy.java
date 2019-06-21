package com.facebook.appevents.codeless.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.view.i;
import android.util.Base64;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.facebook.internal.Utility;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ViewHierarchy
{
  private static final int ADAPTER_VIEW_ITEM_BITMASK = 9;
  private static final int BUTTON_BITMASK = 2;
  private static final int CHECKBOX_BITMASK = 15;
  private static final String CHILDREN_VIEW_KEY = "childviews";
  private static final String CLASS_NAME_KEY = "classname";
  private static final String CLASS_TYPE_BITMASK_KEY = "classtypebitmask";
  private static final int CLICKABLE_VIEW_BITMASK = 5;
  private static final String DESC_KEY = "description";
  private static final String DIMENSION_HEIGHT_KEY = "height";
  private static final String DIMENSION_KEY = "dimension";
  private static final String DIMENSION_LEFT_KEY = "left";
  private static final String DIMENSION_SCROLL_X_KEY = "scrollx";
  private static final String DIMENSION_SCROLL_Y_KEY = "scrolly";
  private static final String DIMENSION_TOP_KEY = "top";
  private static final String DIMENSION_VISIBILITY_KEY = "visibility";
  private static final String DIMENSION_WIDTH_KEY = "width";
  private static final String GET_ACCESSIBILITY_METHOD = "getAccessibilityDelegate";
  private static final String HINT_KEY = "hint";
  private static final String ICON_BITMAP = "icon_image";
  private static final int ICON_MAX_EDGE_LENGTH = 44;
  private static final String ID_KEY = "id";
  private static final int IMAGEVIEW_BITMASK = 1;
  private static final int INPUT_BITMASK = 11;
  private static final int LABEL_BITMASK = 10;
  private static final int PICKER_BITMASK = 12;
  private static final int RADIO_GROUP_BITMASK = 14;
  private static final int RATINGBAR_BITMASK = 16;
  private static final int REACT_NATIVE_BUTTON_BITMASK = 6;
  private static final int SWITCH_BITMASK = 13;
  private static final String TAG;
  private static final String TAG_KEY = "tag";
  private static final int TEXTVIEW_BITMASK = 0;
  private static final String TEXT_IS_BOLD = "is_bold";
  private static final String TEXT_IS_ITALIC = "is_italic";
  private static final String TEXT_KEY = "text";
  private static final String TEXT_SIZE = "font_size";
  private static final String TEXT_STYLE = "text_style";

  static
  {
    AppMethodBeat.i(72132);
    TAG = ViewHierarchy.class.getCanonicalName();
    AppMethodBeat.o(72132);
  }

  public static List<View> getChildrenOfView(View paramView)
  {
    AppMethodBeat.i(72118);
    ArrayList localArrayList = new ArrayList();
    if ((paramView != null) && ((paramView instanceof ViewGroup)))
    {
      paramView = (ViewGroup)paramView;
      int i = paramView.getChildCount();
      for (int j = 0; j < i; j++)
        localArrayList.add(paramView.getChildAt(j));
    }
    AppMethodBeat.o(72118);
    return localArrayList;
  }

  private static int getClassTypeBitmask(View paramView)
  {
    AppMethodBeat.i(72122);
    int i = 0;
    if ((paramView instanceof ImageView))
      i = 2;
    int j = i;
    if (isClickableView(paramView))
      j = i | 0x20;
    i = j;
    if (isAdapterViewItem(paramView))
      i = j | 0x200;
    if ((paramView instanceof TextView))
    {
      j = i | 0x400 | 0x1;
      i = j;
      if ((paramView instanceof Button))
      {
        j |= 4;
        if ((paramView instanceof Switch))
          i = j | 0x2000;
      }
      else
      {
        j = i;
        if ((paramView instanceof EditText))
          j = i | 0x800;
      }
    }
    while (true)
    {
      AppMethodBeat.o(72122);
      return j;
      i = j;
      if (!(paramView instanceof CheckBox))
        break;
      i = j | 0x8000;
      break;
      if (((paramView instanceof Spinner)) || ((paramView instanceof DatePicker)))
      {
        j = i | 0x1000;
      }
      else if ((paramView instanceof RatingBar))
      {
        j = i | 0x10000;
      }
      else if ((paramView instanceof RadioGroup))
      {
        j = i | 0x4000;
      }
      else
      {
        j = i;
        if ((paramView instanceof ViewGroup))
        {
          j = i;
          if (isRCTButton(paramView))
            j = i | 0x40;
        }
      }
    }
  }

  public static JSONObject getDictionaryOfView(View paramView)
  {
    AppMethodBeat.i(72121);
    Object localObject = new JSONObject();
    try
    {
      localJSONObject = setBasicInfoOfView(paramView, (JSONObject)localObject);
    }
    catch (JSONException paramView)
    {
      try
      {
        localObject = new org/json/JSONArray;
        ((JSONArray)localObject).<init>();
        paramView = getChildrenOfView(paramView);
        for (int i = 0; i < paramView.size(); i++)
          ((JSONArray)localObject).put(getDictionaryOfView((View)paramView.get(i)));
        localJSONObject.put("childviews", localObject);
        for (paramView = localJSONObject; ; paramView = (View)localObject)
        {
          AppMethodBeat.o(72121);
          return paramView;
          paramView = paramView;
        }
      }
      catch (JSONException paramView)
      {
        while (true)
        {
          JSONObject localJSONObject;
          paramView = localJSONObject;
        }
      }
    }
  }

  private static JSONObject getDimensionOfView(View paramView)
  {
    AppMethodBeat.i(72127);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("top", paramView.getTop());
      localJSONObject.put("left", paramView.getLeft());
      localJSONObject.put("width", paramView.getWidth());
      localJSONObject.put("height", paramView.getHeight());
      localJSONObject.put("scrollx", paramView.getScrollX());
      localJSONObject.put("scrolly", paramView.getScrollY());
      localJSONObject.put("visibility", paramView.getVisibility());
      label90: AppMethodBeat.o(72127);
      return localJSONObject;
    }
    catch (JSONException paramView)
    {
      break label90;
    }
  }

  public static View.AccessibilityDelegate getExistingDelegate(View paramView)
  {
    AppMethodBeat.i(72128);
    try
    {
      paramView = (View.AccessibilityDelegate)paramView.getClass().getMethod("getAccessibilityDelegate", new Class[0]).invoke(paramView, new Object[0]);
      AppMethodBeat.o(72128);
      return paramView;
    }
    catch (NoSuchMethodException paramView)
    {
      while (true)
      {
        AppMethodBeat.o(72128);
        paramView = null;
      }
    }
    catch (NullPointerException paramView)
    {
      while (true)
      {
        AppMethodBeat.o(72128);
        paramView = null;
      }
    }
    catch (SecurityException paramView)
    {
      while (true)
      {
        AppMethodBeat.o(72128);
        paramView = null;
      }
    }
    catch (IllegalAccessException paramView)
    {
      while (true)
      {
        AppMethodBeat.o(72128);
        paramView = null;
      }
    }
    catch (InvocationTargetException paramView)
    {
      while (true)
      {
        AppMethodBeat.o(72128);
        paramView = null;
      }
    }
  }

  public static View.OnTouchListener getExistingOnTouchListener(View paramView)
  {
    Object localObject1 = null;
    AppMethodBeat.i(72129);
    try
    {
      Object localObject2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
      if (localObject2 != null)
        ((Field)localObject2).setAccessible(true);
      localObject2 = ((Field)localObject2).get(paramView);
      if (localObject2 == null)
      {
        AppMethodBeat.o(72129);
        paramView = localObject1;
      }
      while (true)
      {
        return paramView;
        paramView = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
        if (paramView == null)
          break;
        paramView.setAccessible(true);
        paramView = (View.OnTouchListener)paramView.get(localObject2);
        AppMethodBeat.o(72129);
      }
    }
    catch (NoSuchFieldException paramView)
    {
      while (true)
      {
        Utility.logd(TAG, paramView);
        AppMethodBeat.o(72129);
        paramView = localObject1;
      }
    }
    catch (ClassNotFoundException paramView)
    {
      while (true)
        Utility.logd(TAG, paramView);
    }
    catch (IllegalAccessException paramView)
    {
      while (true)
      {
        Utility.logd(TAG, paramView);
        continue;
        paramView = null;
      }
    }
  }

  public static String getHintOfView(View paramView)
  {
    AppMethodBeat.i(72126);
    CharSequence localCharSequence = null;
    if ((paramView instanceof TextView))
    {
      localCharSequence = ((TextView)paramView).getHint();
      if (localCharSequence != null)
        break label57;
      paramView = "";
      AppMethodBeat.o(72126);
    }
    while (true)
    {
      return paramView;
      if (!(paramView instanceof EditText))
        break;
      localCharSequence = ((EditText)paramView).getHint();
      break;
      label57: paramView = localCharSequence.toString();
      AppMethodBeat.o(72126);
    }
  }

  public static ViewGroup getParentOfView(View paramView)
  {
    AppMethodBeat.i(72117);
    if (paramView == null)
    {
      AppMethodBeat.o(72117);
      paramView = null;
    }
    while (true)
    {
      return paramView;
      paramView = paramView.getParent();
      if ((paramView != null) && ((paramView instanceof ViewGroup)))
      {
        paramView = (ViewGroup)paramView;
        AppMethodBeat.o(72117);
      }
      else
      {
        AppMethodBeat.o(72117);
        paramView = null;
      }
    }
  }

  public static String getTextOfView(View paramView)
  {
    AppMethodBeat.i(72125);
    Object localObject;
    if ((paramView instanceof TextView))
    {
      localObject = ((TextView)paramView).getText();
      if ((paramView instanceof Switch))
      {
        if (!((Switch)paramView).isChecked())
          break label58;
        localObject = "1";
      }
    }
    while (true)
    {
      if (localObject == null)
      {
        paramView = "";
        AppMethodBeat.o(72125);
      }
      while (true)
      {
        return paramView;
        label58: localObject = "0";
        break;
        if ((paramView instanceof Spinner))
        {
          paramView = ((Spinner)paramView).getSelectedItem();
          if (paramView == null)
            break label315;
          localObject = paramView.toString();
          break;
        }
        if ((paramView instanceof DatePicker))
        {
          paramView = (DatePicker)paramView;
          localObject = String.format("%04d-%02d-%02d", new Object[] { Integer.valueOf(paramView.getYear()), Integer.valueOf(paramView.getMonth()), Integer.valueOf(paramView.getDayOfMonth()) });
          break;
        }
        if ((paramView instanceof TimePicker))
        {
          paramView = (TimePicker)paramView;
          localObject = String.format("%02d:%02d", new Object[] { Integer.valueOf(paramView.getCurrentHour().intValue()), Integer.valueOf(paramView.getCurrentMinute().intValue()) });
          break;
        }
        if ((paramView instanceof RadioGroup))
        {
          localObject = (RadioGroup)paramView;
          int i = ((RadioGroup)localObject).getCheckedRadioButtonId();
          int j = ((RadioGroup)localObject).getChildCount();
          for (int k = 0; ; k++)
          {
            if (k >= j)
              break label270;
            paramView = ((RadioGroup)localObject).getChildAt(k);
            if ((paramView.getId() == i) && ((paramView instanceof RadioButton)))
            {
              localObject = ((RadioButton)paramView).getText();
              break;
            }
          }
          label270: localObject = null;
          break;
        }
        if (!(paramView instanceof RatingBar))
          break label310;
        localObject = String.valueOf(((RatingBar)paramView).getRating());
        break;
        paramView = localObject.toString();
        AppMethodBeat.o(72125);
      }
      label310: localObject = null;
      continue;
      label315: localObject = null;
    }
  }

  private static boolean isAdapterViewItem(View paramView)
  {
    AppMethodBeat.i(72124);
    paramView = paramView.getParent();
    boolean bool;
    if ((paramView != null) && (((paramView instanceof AdapterView)) || ((paramView instanceof i))))
    {
      bool = true;
      AppMethodBeat.o(72124);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(72124);
    }
  }

  public static boolean isClickableView(View paramView)
  {
    AppMethodBeat.i(72123);
    try
    {
      Object localObject = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
      if (localObject != null)
        ((Field)localObject).setAccessible(true);
      localObject = ((Field)localObject).get(paramView);
      if (localObject == null)
      {
        AppMethodBeat.o(72123);
        bool = false;
      }
      while (true)
      {
        return bool;
        paramView = null;
        Field localField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
        if (localField != null)
          paramView = (View.OnClickListener)localField.get(localObject);
        if (paramView != null)
        {
          AppMethodBeat.o(72123);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(72123);
          bool = false;
        }
      }
    }
    catch (Exception paramView)
    {
      while (true)
      {
        AppMethodBeat.o(72123);
        boolean bool = false;
      }
    }
  }

  public static boolean isRCTButton(View paramView)
  {
    AppMethodBeat.i(72130);
    boolean bool;
    if ((paramView.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup")) && (getExistingDelegate(paramView) != null) && (((ViewGroup)paramView).getChildCount() > 0))
    {
      bool = true;
      AppMethodBeat.o(72130);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(72130);
    }
  }

  public static boolean isRCTTextView(View paramView)
  {
    AppMethodBeat.i(72131);
    boolean bool = paramView.getClass().getName().equals("com.facebook.react.views.view.ReactTextView");
    AppMethodBeat.o(72131);
    return bool;
  }

  public static JSONObject setAppearanceOfView(View paramView, JSONObject paramJSONObject, float paramFloat)
  {
    AppMethodBeat.i(72120);
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      Object localObject;
      if ((paramView instanceof TextView))
      {
        localObject = (TextView)paramView;
        Typeface localTypeface = ((TextView)localObject).getTypeface();
        if (localTypeface != null)
        {
          localJSONObject.put("font_size", ((TextView)localObject).getTextSize());
          localJSONObject.put("is_bold", localTypeface.isBold());
          localJSONObject.put("is_italic", localTypeface.isItalic());
          paramJSONObject.put("text_style", localJSONObject);
        }
      }
      if ((paramView instanceof ImageView))
      {
        localObject = ((ImageView)paramView).getDrawable();
        if (((localObject instanceof BitmapDrawable)) && (paramView.getHeight() / paramFloat <= 44.0F) && (paramView.getWidth() / paramFloat <= 44.0F))
        {
          paramView = ((BitmapDrawable)localObject).getBitmap();
          localObject = new java/io/ByteArrayOutputStream;
          ((ByteArrayOutputStream)localObject).<init>();
          paramView.compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject);
          paramJSONObject.put("icon_image", Base64.encodeToString(((ByteArrayOutputStream)localObject).toByteArray(), 0));
        }
      }
      AppMethodBeat.o(72120);
      return paramJSONObject;
    }
    catch (JSONException paramView)
    {
      while (true)
        Utility.logd(TAG, paramView);
    }
  }

  public static JSONObject setBasicInfoOfView(View paramView, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(72119);
    try
    {
      String str1 = getTextOfView(paramView);
      String str2 = getHintOfView(paramView);
      Object localObject = paramView.getTag();
      CharSequence localCharSequence = paramView.getContentDescription();
      paramJSONObject.put("classname", paramView.getClass().getCanonicalName());
      paramJSONObject.put("classtypebitmask", getClassTypeBitmask(paramView));
      paramJSONObject.put("id", paramView.getId());
      if (!SensitiveUserDataUtils.isSensitiveUserData(paramView))
        paramJSONObject.put("text", str1);
      while (true)
      {
        paramJSONObject.put("hint", str2);
        if (localObject != null)
          paramJSONObject.put("tag", localObject.toString());
        if (localCharSequence != null)
          paramJSONObject.put("description", localCharSequence.toString());
        paramJSONObject.put("dimension", getDimensionOfView(paramView));
        AppMethodBeat.o(72119);
        return paramJSONObject;
        paramJSONObject.put("text", "");
      }
    }
    catch (JSONException paramView)
    {
      while (true)
        Utility.logd(TAG, paramView);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.codeless.internal.ViewHierarchy
 * JD-Core Version:    0.6.2
 */