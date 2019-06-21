package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public final class NativeAppCallAttachmentStore
{
  static final String ATTACHMENTS_DIR_NAME = "com.facebook.NativeAppCallAttachmentStore.files";
  private static final String TAG;
  private static File attachmentsDirectory;

  static
  {
    AppMethodBeat.i(72436);
    TAG = NativeAppCallAttachmentStore.class.getName();
    AppMethodBeat.o(72436);
  }

  public static void addAttachments(Collection<NativeAppCallAttachmentStore.Attachment> paramCollection)
  {
    AppMethodBeat.i(72428);
    if ((paramCollection == null) || (paramCollection.size() == 0))
      AppMethodBeat.o(72428);
    while (true)
    {
      return;
      if (attachmentsDirectory == null)
        cleanupAllAttachments();
      ensureAttachmentsDirectoryExists();
      Object localObject = new ArrayList();
      try
      {
        paramCollection = paramCollection.iterator();
        while (true)
        {
          if (!paramCollection.hasNext())
            break label192;
          localAttachment = (NativeAppCallAttachmentStore.Attachment)paramCollection.next();
          if (NativeAppCallAttachmentStore.Attachment.access$100(localAttachment))
          {
            localFile = getAttachmentFile(NativeAppCallAttachmentStore.Attachment.access$200(localAttachment), NativeAppCallAttachmentStore.Attachment.access$300(localAttachment), true);
            ((List)localObject).add(localFile);
            if (NativeAppCallAttachmentStore.Attachment.access$400(localAttachment) == null)
              break;
            processAttachmentBitmap(NativeAppCallAttachmentStore.Attachment.access$400(localAttachment), localFile);
          }
        }
      }
      catch (IOException paramCollection)
      {
        while (true)
        {
          NativeAppCallAttachmentStore.Attachment localAttachment;
          File localFile;
          new StringBuilder("Got unexpected exception:").append(paramCollection);
          localObject = ((List)localObject).iterator();
          while (((Iterator)localObject).hasNext())
          {
            localFile = (File)((Iterator)localObject).next();
            try
            {
              localFile.delete();
            }
            catch (Exception localException)
            {
            }
          }
          if (NativeAppCallAttachmentStore.Attachment.access$500(localAttachment) != null)
            processAttachmentFile(NativeAppCallAttachmentStore.Attachment.access$500(localAttachment), NativeAppCallAttachmentStore.Attachment.access$600(localAttachment), localException);
        }
        label192: AppMethodBeat.o(72428);
        continue;
        paramCollection = new FacebookException(paramCollection);
        AppMethodBeat.o(72428);
      }
    }
    throw paramCollection;
  }

  public static void cleanupAllAttachments()
  {
    AppMethodBeat.i(72435);
    Utility.deleteDirectory(getAttachmentsDirectory());
    AppMethodBeat.o(72435);
  }

  public static void cleanupAttachmentsForCall(UUID paramUUID)
  {
    AppMethodBeat.i(72429);
    paramUUID = getAttachmentsDirectoryForCall(paramUUID, false);
    if (paramUUID != null)
      Utility.deleteDirectory(paramUUID);
    AppMethodBeat.o(72429);
  }

  public static NativeAppCallAttachmentStore.Attachment createAttachment(UUID paramUUID, Bitmap paramBitmap)
  {
    AppMethodBeat.i(72424);
    Validate.notNull(paramUUID, "callId");
    Validate.notNull(paramBitmap, "attachmentBitmap");
    paramUUID = new NativeAppCallAttachmentStore.Attachment(paramUUID, paramBitmap, null, null);
    AppMethodBeat.o(72424);
    return paramUUID;
  }

  public static NativeAppCallAttachmentStore.Attachment createAttachment(UUID paramUUID, Uri paramUri)
  {
    AppMethodBeat.i(72425);
    Validate.notNull(paramUUID, "callId");
    Validate.notNull(paramUri, "attachmentUri");
    paramUUID = new NativeAppCallAttachmentStore.Attachment(paramUUID, null, paramUri, null);
    AppMethodBeat.o(72425);
    return paramUUID;
  }

  static File ensureAttachmentsDirectoryExists()
  {
    AppMethodBeat.i(72432);
    File localFile = getAttachmentsDirectory();
    localFile.mkdirs();
    AppMethodBeat.o(72432);
    return localFile;
  }

  static File getAttachmentFile(UUID paramUUID, String paramString, boolean paramBoolean)
  {
    Object localObject = null;
    AppMethodBeat.i(72434);
    File localFile = getAttachmentsDirectoryForCall(paramUUID, paramBoolean);
    if (localFile == null)
    {
      AppMethodBeat.o(72434);
      paramUUID = localObject;
    }
    while (true)
    {
      return paramUUID;
      try
      {
        paramUUID = new java/io/File;
        paramUUID.<init>(localFile, URLEncoder.encode(paramString, "UTF-8"));
        AppMethodBeat.o(72434);
      }
      catch (UnsupportedEncodingException paramUUID)
      {
        AppMethodBeat.o(72434);
        paramUUID = localObject;
      }
    }
  }

  static File getAttachmentsDirectory()
  {
    try
    {
      AppMethodBeat.i(72431);
      if (attachmentsDirectory == null)
      {
        localFile = new java/io/File;
        localFile.<init>(FacebookSdk.getApplicationContext().getCacheDir(), "com.facebook.NativeAppCallAttachmentStore.files");
        attachmentsDirectory = localFile;
      }
      File localFile = attachmentsDirectory;
      AppMethodBeat.o(72431);
      return localFile;
    }
    finally
    {
    }
  }

  static File getAttachmentsDirectoryForCall(UUID paramUUID, boolean paramBoolean)
  {
    AppMethodBeat.i(72433);
    if (attachmentsDirectory == null)
    {
      paramUUID = null;
      AppMethodBeat.o(72433);
    }
    while (true)
    {
      return paramUUID;
      paramUUID = new File(attachmentsDirectory, paramUUID.toString());
      if ((paramBoolean) && (!paramUUID.exists()))
        paramUUID.mkdirs();
      AppMethodBeat.o(72433);
    }
  }

  public static File openAttachment(UUID paramUUID, String paramString)
  {
    AppMethodBeat.i(72430);
    if ((Utility.isNullOrEmpty(paramString)) || (paramUUID == null))
    {
      paramUUID = new FileNotFoundException();
      AppMethodBeat.o(72430);
      throw paramUUID;
    }
    try
    {
      paramUUID = getAttachmentFile(paramUUID, paramString, false);
      AppMethodBeat.o(72430);
      return paramUUID;
    }
    catch (IOException paramUUID)
    {
      paramUUID = new FileNotFoundException();
      AppMethodBeat.o(72430);
    }
    throw paramUUID;
  }

  private static void processAttachmentBitmap(Bitmap paramBitmap, File paramFile)
  {
    AppMethodBeat.i(72426);
    paramFile = new FileOutputStream(paramFile);
    try
    {
      paramBitmap.compress(Bitmap.CompressFormat.JPEG, 100, paramFile);
      return;
    }
    finally
    {
      Utility.closeQuietly(paramFile);
      AppMethodBeat.o(72426);
    }
    throw paramBitmap;
  }

  private static void processAttachmentFile(Uri paramUri, boolean paramBoolean, File paramFile)
  {
    AppMethodBeat.i(72427);
    FileOutputStream localFileOutputStream = new FileOutputStream(paramFile);
    if (!paramBoolean);
    try
    {
      paramFile = new java/io/FileInputStream;
      paramFile.<init>(paramUri.getPath());
      for (paramUri = paramFile; ; paramUri = FacebookSdk.getApplicationContext().getContentResolver().openInputStream(paramUri))
      {
        Utility.copyAndCloseInputStream(paramUri, localFileOutputStream);
        return;
      }
    }
    finally
    {
      Utility.closeQuietly(localFileOutputStream);
      AppMethodBeat.o(72427);
    }
    throw paramUri;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.internal.NativeAppCallAttachmentStore
 * JD-Core Version:    0.6.2
 */