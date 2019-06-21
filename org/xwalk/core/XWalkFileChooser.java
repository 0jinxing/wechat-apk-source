package org.xwalk.core;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Environment;
import android.os.Parcelable;
import android.webkit.ValueCallback;
import android.webkit.ValueCallback<Landroid.net.Uri;>;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class XWalkFileChooser
{
  private static final String ALL_AUDIO_TYPES = "audio/*";
  private static final String ALL_IMAGE_TYPES = "image/*";
  private static final String ALL_VIDEO_TYPES = "video/*";
  private static final String ANY_TYPES = "*/*";
  private static final String AUDIO_TYPE = "audio/";
  private static final String IMAGE_TYPE = "image/";
  public static final int INPUT_FILE_REQUEST_CODE = 1;
  private static final String PATH_PREFIX = "file:";
  private static final String SPLIT_EXPRESSION = ",";
  private static final String TAG = "XWalkFileChooser";
  private static final String VIDEO_TYPE = "video/";
  private static final String WRITE_EXTERNAL_STORAGE = "android.permission.WRITE_EXTERNAL_STORAGE";
  private Activity mActivity;
  private String mCameraPhotoPath;
  private ValueCallback<Uri> mFilePathCallback;

  public XWalkFileChooser(Activity paramActivity)
  {
    this.mActivity = paramActivity;
  }

  private boolean canWriteExternalStorage()
  {
    AppMethodBeat.i(85636);
    try
    {
      bool = Arrays.asList(this.mActivity.getPackageManager().getPackageInfo(this.mActivity.getPackageName(), 4096).requestedPermissions).contains("android.permission.WRITE_EXTERNAL_STORAGE");
      AppMethodBeat.o(85636);
      return bool;
    }
    catch (NullPointerException localNullPointerException)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(85636);
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      label47: break label47;
    }
  }

  private File createImageFile()
  {
    Object localObject1 = null;
    AppMethodBeat.i(85637);
    if (!Environment.getExternalStorageState().equals("mounted"))
    {
      Log.e("XWalkFileChooser", "External storage is not mounted.");
      AppMethodBeat.o(85637);
    }
    while (true)
    {
      return localObject1;
      Object localObject2 = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
      localObject2 = "JPEG_" + (String)localObject2 + "_";
      Object localObject3 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
      if (!((File)localObject3).exists())
        ((File)localObject3).mkdirs();
      try
      {
        localObject2 = File.createTempFile((String)localObject2, ".jpg", (File)localObject3);
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("Created image file: ");
        Log.d("XWalkFileChooser", ((File)localObject2).getAbsolutePath());
        AppMethodBeat.o(85637);
        localObject1 = localObject2;
      }
      catch (IOException localIOException)
      {
        Log.e("XWalkFileChooser", "Unable to create Image File, please make sure permission 'WRITE_EXTERNAL_STORAGE' was added.");
        AppMethodBeat.o(85637);
      }
    }
  }

  private boolean deleteImageFile()
  {
    AppMethodBeat.i(85638);
    boolean bool;
    if ((this.mCameraPhotoPath == null) || (!this.mCameraPhotoPath.contains("file:")))
    {
      bool = false;
      AppMethodBeat.o(85638);
    }
    while (true)
    {
      return bool;
      String str = this.mCameraPhotoPath.split("file:")[1];
      bool = new File(str).delete();
      Log.d("XWalkFileChooser", "Delete image file: " + str + " result: " + bool);
      AppMethodBeat.o(85638);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(85635);
    if ((paramInt1 == 1) && (this.mFilePathCallback != null))
    {
      Log.d("XWalkFileChooser", "Activity result: ".concat(String.valueOf(paramInt2)));
      if (-1 != paramInt2)
        break label140;
      if ((paramIntent == null) || ((paramIntent.getAction() == null) && (paramIntent.getData() == null)))
      {
        if (this.mCameraPhotoPath == null)
          break label149;
        paramIntent = Uri.parse(this.mCameraPhotoPath);
        if (paramIntent != null)
          Log.d("XWalkFileChooser", "Received file: " + paramIntent.toString());
        this.mFilePathCallback.onReceiveValue(paramIntent);
        this.mFilePathCallback = null;
      }
    }
    else
    {
      AppMethodBeat.o(85635);
      return;
    }
    paramIntent = paramIntent.getDataString();
    if (paramIntent != null);
    for (paramIntent = Uri.parse(paramIntent); ; paramIntent = null)
    {
      deleteImageFile();
      break;
      label140: if (paramInt2 == 0)
        deleteImageFile();
      label149: paramIntent = null;
      break;
    }
  }

  public boolean showFileChooser(ValueCallback<Uri> paramValueCallback, String paramString1, String paramString2)
  {
    AppMethodBeat.i(85634);
    this.mFilePathCallback = paramValueCallback;
    Object localObject = new Intent("android.media.action.IMAGE_CAPTURE");
    paramValueCallback = (ValueCallback<Uri>)localObject;
    Intent localIntent1;
    Intent localIntent2;
    Intent localIntent3;
    if (((Intent)localObject).resolveActivity(this.mActivity.getPackageManager()) != null)
    {
      paramValueCallback = createImageFile();
      if (paramValueCallback != null)
      {
        this.mCameraPhotoPath = ("file:" + paramValueCallback.getAbsolutePath());
        ((Intent)localObject).putExtra("PhotoPath", this.mCameraPhotoPath);
        ((Intent)localObject).putExtra("output", Uri.fromFile(paramValueCallback));
        paramValueCallback = (ValueCallback<Uri>)localObject;
      }
    }
    else
    {
      localIntent1 = new Intent("android.media.action.VIDEO_CAPTURE");
      localIntent2 = new Intent("android.provider.MediaStore.RECORD_SOUND");
      localIntent3 = new Intent("android.intent.action.GET_CONTENT");
      localIntent3.addCategory("android.intent.category.OPENABLE");
      localObject = new ArrayList();
      if ((paramString1.contains(",")) || (paramString1.contains("*/*")))
        break label327;
      if (!paramString2.equals("true"))
        break label299;
      if (!paramString1.startsWith("image/"))
        break label227;
      if (paramValueCallback == null)
        break label327;
      this.mActivity.startActivityForResult(paramValueCallback, 1);
      Log.d("XWalkFileChooser", "Started taking picture");
      AppMethodBeat.o(85634);
    }
    while (true)
    {
      return true;
      paramValueCallback = null;
      break;
      label227: if (paramString1.startsWith("video/"))
      {
        this.mActivity.startActivityForResult(localIntent1, 1);
        Log.d("XWalkFileChooser", "Started camcorder");
        AppMethodBeat.o(85634);
      }
      else
      {
        if (!paramString1.startsWith("audio/"))
          break label327;
        this.mActivity.startActivityForResult(localIntent2, 1);
        Log.d("XWalkFileChooser", "Started sound recorder");
        AppMethodBeat.o(85634);
      }
    }
    label299: if (paramString1.startsWith("image/"))
    {
      if (paramValueCallback != null)
        ((ArrayList)localObject).add(paramValueCallback);
      localIntent3.setType("image/*");
    }
    while (true)
    {
      label327: if ((((ArrayList)localObject).isEmpty()) && (canWriteExternalStorage()))
      {
        if (paramValueCallback != null)
          ((ArrayList)localObject).add(paramValueCallback);
        ((ArrayList)localObject).add(localIntent1);
        ((ArrayList)localObject).add(localIntent2);
        localIntent3.setType("*/*");
      }
      paramValueCallback = new Intent("android.intent.action.CHOOSER");
      paramValueCallback.putExtra("android.intent.extra.INTENT", localIntent3);
      if (!((ArrayList)localObject).isEmpty())
        paramValueCallback.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[])((ArrayList)localObject).toArray(new Intent[0]));
      this.mActivity.startActivityForResult(paramValueCallback, 1);
      Log.d("XWalkFileChooser", "Started chooser");
      AppMethodBeat.o(85634);
      break;
      if (paramString1.startsWith("video/"))
      {
        ((ArrayList)localObject).add(localIntent1);
        localIntent3.setType("video/*");
      }
      else if (paramString1.startsWith("audio/"))
      {
        ((ArrayList)localObject).add(localIntent2);
        localIntent3.setType("audio/*");
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkFileChooser
 * JD-Core Version:    0.6.2
 */