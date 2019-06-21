package com.facebook.internal;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONArray;
import org.json.JSONObject;

public class FetchedAppSettings$DialogFeatureConfig
{
  private static final String DIALOG_CONFIG_DIALOG_NAME_FEATURE_NAME_SEPARATOR = "\\|";
  private static final String DIALOG_CONFIG_NAME_KEY = "name";
  private static final String DIALOG_CONFIG_URL_KEY = "url";
  private static final String DIALOG_CONFIG_VERSIONS_KEY = "versions";
  private String dialogName;
  private Uri fallbackUrl;
  private String featureName;
  private int[] featureVersionSpec;

  private FetchedAppSettings$DialogFeatureConfig(String paramString1, String paramString2, Uri paramUri, int[] paramArrayOfInt)
  {
    this.dialogName = paramString1;
    this.featureName = paramString2;
    this.fallbackUrl = paramUri;
    this.featureVersionSpec = paramArrayOfInt;
  }

  public static DialogFeatureConfig parseDialogConfig(JSONObject paramJSONObject)
  {
    Uri localUri = null;
    String str1 = null;
    AppMethodBeat.i(72301);
    String str2 = paramJSONObject.optString("name");
    if (Utility.isNullOrEmpty(str2))
    {
      AppMethodBeat.o(72301);
      paramJSONObject = str1;
    }
    while (true)
    {
      return paramJSONObject;
      Object localObject = str2.split("\\|");
      if (localObject.length != 2)
      {
        AppMethodBeat.o(72301);
        paramJSONObject = str1;
      }
      else
      {
        str2 = localObject[0];
        localObject = localObject[1];
        if ((Utility.isNullOrEmpty(str2)) || (Utility.isNullOrEmpty((String)localObject)))
        {
          AppMethodBeat.o(72301);
          paramJSONObject = str1;
        }
        else
        {
          str1 = paramJSONObject.optString("url");
          if (!Utility.isNullOrEmpty(str1))
            localUri = Uri.parse(str1);
          paramJSONObject = new DialogFeatureConfig(str2, (String)localObject, localUri, parseVersionSpec(paramJSONObject.optJSONArray("versions")));
          AppMethodBeat.o(72301);
        }
      }
    }
  }

  private static int[] parseVersionSpec(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(72302);
    int[] arrayOfInt = null;
    if (paramJSONArray != null)
    {
      int i = paramJSONArray.length();
      arrayOfInt = new int[i];
      int j = 0;
      while (true)
        if (j < i)
        {
          int k = paramJSONArray.optInt(j, -1);
          int m = k;
          String str;
          if (k == -1)
          {
            str = paramJSONArray.optString(j);
            m = k;
            if (Utility.isNullOrEmpty(str));
          }
          try
          {
            m = Integer.parseInt(str);
            arrayOfInt[j] = m;
            j++;
          }
          catch (NumberFormatException localNumberFormatException)
          {
            while (true)
            {
              Utility.logd("FacebookSDK", localNumberFormatException);
              m = -1;
            }
          }
        }
    }
    AppMethodBeat.o(72302);
    return arrayOfInt;
  }

  public String getDialogName()
  {
    return this.dialogName;
  }

  public Uri getFallbackUrl()
  {
    return this.fallbackUrl;
  }

  public String getFeatureName()
  {
    return this.featureName;
  }

  public int[] getVersionSpec()
  {
    return this.featureVersionSpec;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.internal.FetchedAppSettings.DialogFeatureConfig
 * JD-Core Version:    0.6.2
 */