# Start from the universal image
FROM mcr.microsoft.com/devcontainers/universal:2

# Add Yarn GPG key to fix repository issues
RUN curl -sS https://dl.yarnpkg.com/debian/pubkey.gpg | apt-key add -

# Install openbox
RUN apt-get update && export DEBIAN_FRONTEND=noninteractive \
    && apt-get -y install --no-install-recommends openbox

# Set openbox to start automatically
RUN echo 'openbox-session &' >> ~/.xinitrc