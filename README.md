# HƯỚNG DẪN SỬ DỤNG

## Phần 1: Setup code để có thể bắt đầu thay đổi trực tuyến

B1: Tải phần mềm GitHub Desktop https://github.com/apps/desktop

B2: Tải phần mềm git https://git-scm.com/downloads

B3: Cài đặt git và GitHub Desktop, sau đó đăng nhập vào GitHub Desktop sử dụng account GitHub của bạn

B4: Quay về trang chủ của repo này và nhấn nút "Code" màu xanh lá, sau đó nhấn "Open with GitHub Desktop"

B5: Trong hộp thoại "Clone a repository", để nguyên phần URL nếu URL đã được điền sẵn, nếu phần URL trống thì quay trở lại trang web -> nhấn vào Code -> Copy URL trong hộp thoại -> Quay lại GitHub Desktop và chèn URL copy vào

B6: Đặt Local path tại nơi mà bạn muốn lưu trữ code và nhấn clone

## Phần 2: Thay đổi code và upload code đã thay đổi lên GitHub

B1: Sau khi đã clone repo về máy, nhấn vào "Current branch" -> New branch -> Đặt tên cho branch của bạn -> Publish branch

B2: Mở project vừa clone trong Netbeans và bắt đầu viết code (Lưu ý: không nên tắt GitHub Desktop trong suốt quá trình này)

B3: Sau khi code xong, lưu lại thay đổi trong Netbeans bằng nút save hoặc phím tắt Ctrl + S

B4: quay trở lại GitHub Desktop, bạn sẽ thấy những thay đổi mình đã tạo xuất hiện trong cửa sổ chính. Góc dưới bên trái sẽ có phần Summary và description, điền ý chính về thứ mình đã thay đổi vào phần summary (Bắt buộc)
(VD: cập nhật tính năng add_customer trong CustomerList), có thể mô tả chi tiết hơn về thứ bạn đã cập nhật ở phần description

B5: Sau khi đã điền Summary và description, nhấn Commit to [tên branch], lúc này bạn sẽ thấy hộp thoại màu xanh dương xuất hiện ở cửa sổ chính, nhấn "Preview Pull Request" -> "Create pull request" để tạo yêu cầu 
update thay đổi lên repository chính trên GitHub

**Note: mọi thay đổi trong code sẽ cần phải thông qua chủ repo để review code, chỉ sau khi chủ repo đánh giá code đã ổn định thì lúc đó code của bạn sẽ được chấp thuận và chính thức được update lên master branch**

## Phần 3: Cập nhật code từ repository chính về máy

Repository trên GitHub sẽ là nơi thường xuyên được cập nhật, khi nội dung trên repo được cập nhật, máy của bạn sẽ không tự động cập nhật những thay đổi đó, do đó cần phải thường xuyên cập nhật lại về máy
của mình mỗi khi có commit mới để tiếp tục làm việc.


 B1: Truy cập vào branch cần cập nhật từ menu "Current branch"

 B2: Nhấn vào tab "Branch" (ngay phía trên current branch), một danh sách các lựa chọn sẽ xuất hiện, nhấn vào "Merge into current branch"

 B3: Chọn branch mà mình muốn gộp code vào branch của mình và nhấn "Create a merge commit"
